
package Servlet;


import DAO.DATABASE.Conexao;
import DAO.DATABASE.ImagensDao;
import Model.ImagemDirectorios;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author Pedro
 */
@MultipartConfig
public class UploadServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
      protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            // Diretório onde os arquivos serão salvos
            String uploadDir = "C:\\Users\\Pedro Manjate\\Documents\\GitHub\\CarRental\\web\\carImages"; // Caminho absoluto para o diretório de uploads

            // Obtém todas as partes do request
            String  matricula = request.getParameter("matricula");
            
            for (Part part : request.getParts()) {
                // Obtém o nome do arquivo enviado
                String fileName = part.getSubmittedFileName();
                

                // Define o caminho onde o arquivo será salvo
                String filePath = uploadDir + File.separator + fileName;

                // Obtém o InputStream da parte (arquivo)
                try (InputStream is = part.getInputStream()) {
                    // Chama o método para fazer o upload do arquivo
                    boolean success = uploadFile(is, filePath);
                    if (success) {
                        
                        new ImagensDao(new Conexao().getConnection()).insertImagem(matricula, fileName);
                        out.println("sucesso ao fazer upload do arquivo '" + fileName + "'<br>");
                        
                    } else {
                        out.println("Erro ao fazer upload do arquivo '" + fileName + "'<br>");
                    }
                }
            }   
           
          response.sendRedirect("index.jsp");
            
        }
       
        
  
    }

public boolean uploadFile(InputStream is, String filePath) {
        try {
            // Cria um FileOutputStream para escrever o arquivo no disco
            try (FileOutputStream fos = new FileOutputStream(filePath)) {
                // Cria um buffer de leitura
                byte[] buffer = new byte[4096];
                int bytesRead;

                // Lê os dados do InputStream e escreve no FileOutputStream
                while ((bytesRead = is.read(buffer)) != -1) {
                    fos.write(buffer, 0, bytesRead);
                }
            }

            return true; // Retorna true para indicar sucesso
        } catch (IOException e) {
            e.printStackTrace();
            return false; // Retorna false em caso de erro
        }
    }
   
   
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          try {
              processRequest(request, response);
          } catch (SQLException ex) {
              Logger.getLogger(UploadServlet.class.getName()).log(Level.SEVERE, null, ex);
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(UploadServlet.class.getName()).log(Level.SEVERE, null, ex);
          }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

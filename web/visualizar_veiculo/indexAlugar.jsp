<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="styleAlugar.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@400;600&display=swap" 
              rel="stylesheet">
        <link rel="stylesheet" href="./styleAlugar.css">
        <title>choose car</title>
        <style>
            img {
                transition: linear 0.5s none;
            }

            img.fade-in {
                opacity: 1;
            }

            img.fade-out {
                opacity: 0;
            }

        </style>
    </head>
    <body>
        <%@page import="java.util.*,Model.*,DAO.*,DAO.DATABASE.*" %>
        <%
            int id = Integer.parseInt(request.getParameter("id"));
            new CarroDao(new Conexao().getConnection());
            Carro car = CarroDao.selectPorId(id);

            car
                    .setImages(new ImagensDao(new Conexao()
                            .getConnection())
                            .selectImagensPorMatricula(car
                                    .getMatricula())
                            .getCarroImagens());

            int total = car.getImages().size();

            request.setAttribute("carro", car);
            request.setAttribute("total", total);
        %>

        <header>

            <nav>
                <p class="brand">Rent<strong>Car</strong></p>
                <ul>

                    <a href="../Sigin/signIn.html"><button>Login</button></a>
                </ul>
            </nav>

        </header>


        <section class="catalog">
            <div class="foto_car">
                <div  class="car">
                    <img id="img" src="" alt="">

                </div>



            </div>
            <div class="details">
                <div class="price"><h2>
                        Preco <br>
                        ${carro.getPreco()}MZN/MES
                    </h2></p></div>

                <div class="caracteristics">
                    <p>Marca: <span id="marca">${carro.getFabricante()}</span></p>
                    <p>Modelo: <span id="modelo">${carro.getModelo()}</span></p>
                    <p>Ano: <span id="ano">${carro.getAnoDeFabrico()}</span></p>
                    <p>Cor: <span id="cor">${carro.getCor()}</span></p>
                    <p>Quilometragem: <span id="quilometragem">${carro.getQuilometosPercoridos()} km</span></p>
                    <p>TransmissÃ£o: <span id="transmissao">${carro.getTracao()}</span></p>
                    <p>CombustÃ­vel: <span id="combustivel">${carro.getTipoDeComustivel()}</span></p>
                    <p>Numero de Portas: <span id="portas">${carro.getAssentos()}</span></p>
                    <p>Ar Condicionado: <span id="ar-condicionado">A Gelar tipo TOP 21 AZUL</span></p>
                    <div class="botao">
                        <a href="#" id="button" class="button"> Reservar</a>
                    </div>
                </div>

            </div>
        </section>

        <div class="big-modal">
            <div class="modal-content">
                <div class="close">X</div>
                <h2>Faca o seu pedido</h2>
                <div class="input-container">
                    <input type="date" id="date1" name="date1" required>
                    <label for="date1">Data de InÃ­cio</label>
                </div>

                <div class="input-container">
                    <input type="date" id="date2" name="date2" required>
                    <label for="date2">Data de TÃ©rmino</label>
                </div>
                <div class="botao2">
                    <a href="#" id="button" class="button"> Alugar</a>
                </div>
            </div>
        </div>



        <script>
            const caminhos = []
                 <c:forEach items="${carro.getImages()}" var="car">
                     caminhos.push('${car}')
                </c:forEach>
            
            const total = caminhos.length
            const img = document.getElementById('img');
            img.src = "../carImages/${carro.getImages().get(0)}"


                  let curr = 1
            const temporisador = setInterval(() => {

                if (curr >= total) {
                    curr = 0
                } else {
                    img.classList.add('fade-out');
                }
                img.src = '../carImages/'+caminhos[curr]
                console.log(curr)
                img.classList.remove('fade-out');
                img.classList.add('fade-in');
               
                
                curr = curr + 1
            }, 3000)


        </script>
        <script src="poupap.js"></script>
</html>
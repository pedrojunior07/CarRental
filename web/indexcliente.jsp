<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Car Rent Website</title>

    <!-- ? ==================== FAVICON ==================== ? -->

    <link rel="shortcut icon" href="./images/favicon.svg" type="image/x-icon">

    <!-- ? ==================== CUSTOM CSS ==================== ? -->

    <link rel="stylesheet" href="./styleCliente.css">

    <!-- ? ==================== GOOGLE FONTS ==================== ? -->

    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@400;600&display=swap" 
    rel="stylesheet">

</head>
<body>

            <%@page import="java.util.*,Model.*,DAO.*,DAO.DATABASE.*" %>
            <%
                new CarroDao(new Conexao().getConnection());
                ArrayList<Carro> carros = CarroDao.selectAll();
                for (Carro elem : carros) {
                
                    elem
                    .setImages( new ImagensDao(new Conexao()
                    .getConnection())
                    .selectImagensPorMatricula(elem
                    .getMatricula())
                    .getCarroImagens());
                 
                    }
                
              request.setAttribute("carros", carros);
            %>
    <!-- ? ============== HEADER ============== ? -->
       
    <div class="big-modal">
      <div class="modal-content">
          <div class="close">X</div>
      </div>
  </div>

    <header class="header" data-header>
        <div class="container">
            <div class="overlay" data-overlay></div>
            <a href="#" class="logo">
              <div class="logo-name">AluCar</div>
            </a>

            <nav class="navbar" data-navbar>
                <ul class="navbar-list">
                    <li>
                        <a href="#home" class="navbar-link" data-nav-link>Home</a>
                    </li>

                    <li>
                        <a href="#featured-car" class="navbar-link" data-nav-link>Explore cars</a>
                    </li>

                    <li>
                        <a href="#about" class="navbar-link" data-nav-link>About us</a>
                    </li>

                    <li>
                        <a href="#blog" class="navbar-link" data-nav-link>Blog</a>
                    </li>
                </ul>
            </nav>

            <div class="header-actions">
                <div class="header-contact">
                    <a href="tel:1234567890" class="contact-link">1234567890</a>
                    <span class="contact-time">Mon - Fri: 9:00 am - 6:00 pm</span>
                </div>

                <a href="#featured-car" class="btn" aria-labelledby="">
                    <ion-icon name="car-outline"></ion-icon>

                    <span class="aria-label-text">Explore cars</span>
                </a>

                <a href="#" class="btn user-btn" aria-label="Profile">
                    <ion-icon name="person-outline"></ion-icon>
                </a>

                <button class="nav-toggle-btn" data-nav-toggle-btn aria-label="Toggle Menu">
                    <span class="one"></span>
                    <span class="two"></span>
                    <span class="three"></span>
                </button>
            </div>
        </div>

    </header>


    <!-- ? ============== MAIN ============== ? -->
    <main>
        <article>

            <!-- ? ============== HERO ============== ? -->

            <section class="section hero" id="home">
                <div class="container">
                    <div class="hero-content">
                        <h2 class="h1 hero-title">A maneira facil de adquirir um contrato de arrendamento</h2>

                        <p class="hero-text">
                           
                          Escritorio em Maputo , 
                          Matola e Xibuto!
                        </p>
                    </div>

                    <div class="hero-banner"></div>

                    <form action="" class="hero-form">
                        <div class="input-wrapper">
                            <label for="input-1" class="input-label">
                              Carro, modelo ou marca</label>
                            <input type="text" name="car-model" id="input-1" class="input-field" placeholder="modelo?">
                        </div>

                        <div class="input-wrapper">
                            <label for="input-2" class="input-label">Maximo pagamento mensal</label>
                            <input type="text" name="monthly-pay" id="input-2" class="input-field" placeholder="Adicione um valor em MT">
                        </div>

                        <div class="input-wrapper">
                            <label for="input-3" class="input-label">Diga o ano</label>
                            <input type="text" name="year" id="input-3" class="input-field" placeholder="Ano de producao Mi�nimo">
                        </div>

                        <button type="submit" class="btn">procurar</button>
                    </form>

                </div>
                
            </section>

            <!-- ? ============== FEATURED CAR ============== ? -->
            
                
                 
            <section class="section featured-car" id="featured-car">
                <div class="container">
        
                  <div class="title-wrapper">
                    <h2 class="h2 section-title">Carros em destaque</h2>
        
                    <a href="#" class="featured-car-link">
                      <span>Ver mais</span>
        
                      <ion-icon name="arrow-forward-outline"></ion-icon>
                    </a>
                  </div>
        
                  <ul class="featured-car-list">
        
                    
        
            <c:forEach  items="${carros}" var="carro">
                    <li>
                      <div class="featured-car-card">
        
                        <figure class="card-banner">
                            
                            <img src="./carImages/${carro.getImages().get(0)}" alt="noimage" loading="lazy" width="440" height="300"
                            class="w-100">
                        </figure>
        
                        <div class="card-content">
        
                          <div class="card-title-wrapper">
                              
                            <h3 class="h3 card-title">
                              <a href="#">${carro.getFabricante()} ${carro.getModelo()}</a>
                            </h3>
        
                            <data class="year" value="${carro.getAnoDeFabrico()}">${carro.getAnoDeFabrico()}</data>
                          </div>
        
                          <ul class="card-list">
        
                            <li class="card-list-item">
                              <ion-icon name="people-outline"></ion-icon>
        
                              <span class="card-item-text">${carro.getAssentos()} Pessoas</span>
                            </li>
        
                            <li class="card-list-item">
                              <ion-icon name="flash-outline"></ion-icon>
        
                              <span class="card-item-text">${carro.getTipoDeComustivel()}</span>
                            </li>
        
                            <li class="card-list-item">
                              <ion-icon name="speedometer-outline"></ion-icon>
        
                              <span class="card-item-text">${carro.getKm_litro()}km / 1-litre</span>
                            </li>
        
                            <li class="card-list-item">
                              <ion-icon name="hardware-chip-outline"></ion-icon>
        
                              <span class="card-item-text">${carro.getTracao()}</span>
                            </li>
        
                          </ul>
        
                          <div class="card-price-wrapper">
        
                            <p class="card-price">
                              <strong>${carro.getPreco()}</strong> / Mes
                            </p>
        
                            <button class="btn fav-btn" aria-label="Add to favourite list">
                              <ion-icon name="heart-outline"></ion-icon>
                            </button>
        
                            <a class="btn" id="btn" href="./visualizar_veiculo/indexAlugar.jsp?id=${carro.getId()}">Reservar</a>
        
                          </div>
        
                        </div>
        
                      </div>
                    </li>
        
                    </li>
             </c:forEach>
        
                  </ul>
        
                </div>
            </section>

                
                
                
                
                
            <!-- ? ============== GET START ============== ? -->

            <section class="section get-start">
                <div class="container">
                    <h2 class="h2 section-title">Comece com 4 etapas simples</h2>

                    <ul class="get-start-list">
                        <li>
                            <div class="get-start-card">
                                <div class="card-icon icon-1">
                                    <ion-icon name="person-add-outline"></ion-icon>
                                </div>

                                <h3 class="card-title">Crie um perfil</h3>

                                <p class="card-text">
                                  
                                Se você for usar uma passagem de Lorem Ipsum, precisa ter certeza.
                                </p>

                                <a href="#" class="card-link">Iniciar</a>
                            </div>
                        </li>

                        <li>
                            <div class="get-start-card">
                                <div class="card-icon icon-2">
                                    <ion-icon name="car-outline"></ion-icon>
                                </div>

                                <h3 class="card-title">Diga-nos o que queres</h3>

                                <p class="card-text">
                                    
                                  Varisd versoes estao por vr ao longo dos anos, as vezes por acidente, As vezes Propositalmente
                                </p>

                            </div>
                        </li>

                        <li>
                            <div class="get-start-card">
                                <div class="card-icon icon-3">
                                    <ion-icon name="person-outline"></ion-icon>
                                </div>

                                <h3 class="card-title">Combine com o vendedor</h3>

                                <p class="card-text">
                                  Para fazer um tipo de livro de espécimes. Sobreviveu não apenas cinco séculos,
                                  mas também o salto para a electrónica
                                </p>

                            </div>
                        </li>

                        <li>
                            <div class="get-start-card">
                                <div class="card-icon icon-4">
                                    <ion-icon name="card-outline"></ion-icon>
                                </div>

                                <h3 class="card-title">
                                  Fazer um acordo</h3>

                                <p class="card-text">
                                                                      
                                  Existem muitas variacoes de passagens de Pacotes disponi�veis,
                                  mas a maioria sofreu alteracoes!
                                </p>

                            </div>
                        </li>

                    </ul>
                </div>
            </section>
           

            <!-- ? ============== BLOG ============== ? -->

            <section class="section blog" id="blog">
              <div class="container">
                <h2 class="h2 section-title">Nosso Blog</h2>

                <ul class="blog-list has-scrollbar">
                  <li>
                    <div class="blog-card">
                      <figure class="card-banner">
                        <a href="#">
                          <img src="./images/blog-1.jpg" alt="Opening of new offices of the company" 
                          loading="lazy" class="w-100">
                        </a>

                        <a href="#" class="btn card-badge">Companhia</a>
                      </figure>
                      <div class="card-content">
                        <h3 class="h3 card-title">
                          <a href="#">Abertura de novos escritorios da empresa</a>
                        </h3>
                        <div class="card-meta">
                          <div class="publish-date">
                            <ion-icon name="time-outline"></ion-icon>
                            <time datetime="now">
                                <% Calendar.getInstance().getTime().toString(); %></time>
                          </div>
                          <div class="comments">
                            <ion-icon name="chatbubble-ellipses-outline"></ion-icon>
                            <data value="114">114</data>
                          </div>
                        </div>
                      </div>
                    </div>
                  </li>

                  <li>
                    <div class="blog-card">
                      <figure class="card-banner">
                        <a href="#">
                          <img src="./images/blog-2.jpg" alt="What cars are most vulnerable" 
                          loading="lazy" class="w-100">
                        </a>

                        <a href="#" class="btn card-badge">Repair</a>
                      </figure>
                      <div class="card-content">
                        <h3 class="h3 card-title">
                          <a href="#">Quais carros sao mais vulneraveis</a>
                        </h3>
                        <div class="card-meta">
                          <div class="publish-date">
                            <ion-icon name="time-outline"></ion-icon>
                            <time datetime="2022-01-14"> <% Calendar.getInstance().getTime().toString(); %> </time>
                          </div>
                          <div class="comments">
                            <ion-icon name="chatbubble-ellipses-outline"></ion-icon>
                            <data value="114">114</data>
                          </div>
                        </div>
                      </div>
                    </div>
                  </li>

                  <li>
                    <div class="blog-card">
                      <figure class="card-banner">
                        <a href="#">
                          <img src="./images/blog-3.jpg" alt="Statistics showed which average age" 
                          loading="lazy" class="w-100">
                        </a>

                        <a href="#" class="btn card-badge">Cars</a>
                      </figure>
                      <div class="card-content">
                        <h3 class="h3 card-title">
                          <a href="#">
                            As estatísticas mostraram qual idade média</a>
                        </h3>
                        <div class="card-meta">
                          <div class="publish-date">
                            <ion-icon name="time-outline"></ion-icon>
                            <time datetime="2022-01-14">January 14, 2022 </time>
                          </div>
                          <div class="comments">
                            <ion-icon name="chatbubble-ellipses-outline"></ion-icon>
                            <data value="114">114</data>
                          </div>
                        </div>
                      </div>
                    </div>
                  </li>

                  <li>
                    <div class="blog-card">
                      <figure class="card-banner">
                        <a href="#">
                          <img src="./images/blog-4.jpg" alt="What´s required when renting a car?" 
                          loading="lazy" class="w-100">
                        </a>

                        <a href="#" class="btn card-badge">Cars</a>
                      </figure>
                      <div class="card-content">
                        <h3 class="h3 card-title">
                          <a href="#">
                            O que é necessário ao alugar um carro?</a>
                        </h3>
                        <div class="card-meta">
                          <div class="publish-date">
                            <ion-icon name="time-outline"></ion-icon>
                            <time datetime="2022-01-14">January 14, 2022 </time>
                          </div>
                          <div class="comments">
                            <ion-icon name="chatbubble-ellipses-outline"></ion-icon>
                            <data value="114">114</data>
                          </div>
                        </div>
                      </div>
                    </div>
                  </li>

                  <li>
                    <div class="blog-card">
                      <figure class="card-banner">
                        <a href="#">
                          <img src="./images/blog-5.jpg" alt="New rules for handling our cars" 
                          loading="lazy" class="w-100">
                        </a>

                        <a href="#" class="btn card-badge">Company</a>
                      </figure>
                      <div class="card-content">
                        <h3 class="h3 card-title">
                          <a href="#">
                            Novas regras para lidar com nossos carros</a>
                        </h3>
                        <div class="card-meta">
                          <div class="publish-date">
                            <ion-icon name="time-outline"></ion-icon>
                            <time datetime="2022-01-14">January 14, 2022 </time>
                          </div>
                          <div class="comments">
                            <ion-icon name="chatbubble-ellipses-outline"></ion-icon>
                            <data value="114">114</data>
                          </div>
                        </div>
                      </div>
                    </div>
                  </li>
                </ul>

              </div>
            </section>

        </article>
           
 
    </main>
 
    <!-- ? ============== FOOTER ============== ? -->

    <footer class="footer">
      <div class="container">
        <div class="footer-top">
          <div class="footer-brand">
            <a href="#" class="logo">
              <img src="./images/logo1.png" alt="Alpha97 Logo">
            </a>

            <p class="footer-text">
              Pesquise carros de aluguel baratos em Nova York. Com uma frota diversificada de 19 mil veículos, a Waydex oferece aos seus consumidores uma
              seleção atraente e divertida
            </p>
          </div>

          <ul class="footer-list">
            <li>
              <p class="footer-list-title">Company</p>
            </li>

            <li>
              <a href="#" class="footer-link">Sobre</a>
            </li>

            <li>
              <a href="#" class="footer-link">
                Planos de preços</a>
            </li>

            <li>
              <a href="#" class="footer-link">Nosso blog</a>
            </li>

            <li>
              <a href="#" class="footer-link">Contacts</a>
            </li>

          </ul>

          <ul class="footer-list">
            <li>
              <p class="footer-list-title">Support</p>
            </li>

            <li>
              <a href="#" class="footer-link">Help center</a>
            </li>

            <li>
              <a href="#" class="footer-link">Ask a question</a>
            </li>

            <li>
              <a href="#" class="footer-link">Privacy policy</a>
            </li>

            <li>
              <a href="#" class="footer-link">Terms & conditions</a>
            </li>

          </ul>

          <ul class="footer-list">
            <li>
              <p class="footer-list-title">Neighborhoods in New York</p>
            </li>

            <li>
              <a href="#" class="footer-link">Manhattan</a>
            </li>

            <li>
              <a href="#" class="footer-link">Central New York City</a>
            </li>

            <li>
              <a href="#" class="footer-link">Upper East Side</a>
            </li>

            <li>
              <a href="#" class="footer-link">Queens</a>
            </li>

            <li>
              <a href="#" class="footer-link">Theater District</a>
            </li>

            <li>
              <a href="#" class="footer-link">Midtown</a>
            </li>

            <li>
              <a href="#" class="footer-link">SoHo</a>
            </li>

            <li>
              <a href="#" class="footer-link">Chelsea</a>
            </li>

          </ul>

        </div>

        <div class="footer-bottom">

          <ul class="social-list">

            <li>
              <a href="#" class="social-link">
                <ion-icon name="logo-facebook"></ion-icon>
              </a>
            </li>

            <li>
              <a href="#" class="social-link">
                <ion-icon name="logo-instagram"></ion-icon>
              </a>
            </li>

            <li>
              <a href="#" class="social-link">
                <ion-icon name="logo-twitter"></ion-icon>
              </a>
            </li>

            <li>
              <a href="#" class="social-link">
                <ion-icon name="logo-linkedin"></ion-icon>
              </a>
            </li>

            <li>
              <a href="#" class="social-link">
                <ion-icon name="logo-skype"></ion-icon>
              </a>
            </li>

            <li>
              <a href="#" class="social-link">
                <ion-icon name="mail-outline"></ion-icon>
              </a>
            </li>

          </ul>

          <p class="copyright">
            &copy; 2023 <a href="https://www.linkedin.com/in/usamaweb/">Pedro, Celso, Paulo </a> 
            <a href="https://github.com/usamaweb">ALUCAR</a>. All Rights Reserved
          </p>

        </div>
      </div>
    </footer>

    













    <div class="big-modal">
      <div class="modal-content">
          <div class="close">X</div>
      </div>
     
  </div>







    <!-- ? ==================== CUSTOM JS ==================== ? -->

    <script src="./scriptCliente.js"></script>

    <!-- ? ==================== IONICON ==================== ? -->

    <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>

</body>
</html>
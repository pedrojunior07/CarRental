/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


 // Função para carregar conteúdo dinâmico via Fetch API
    function loadPage(page) {
        fetch(page)
            .then(response => response.text())
            .then(data => {
                document.getElementById('dynamic-content').innerHTML = data;
            })
            .catch(error => console.error('Error:', error));
    }

    // Associar scripts aos botões do sidebar
    document.addEventListener('DOMContentLoaded', function() {
        document.querySelectorAll('.side-menu a').forEach(function(element) {
            element.addEventListener('click', function(event) {
                event.preventDefault();
                var page = this.getAttribute('href');
                loadPage(page);
            });
        });
    });
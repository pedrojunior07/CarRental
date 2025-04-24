<%-- 
    Document   : viaturas
    Created on : May 7, 2024, 1:35:17 PM
    Author     : Pedro
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Adicionar Novo Carro</title>
    <style>
        :root {
            --color-white: #fff;
            --color-red: #e63636;
            --color-dark1: rgb(19, 21, 21);
            --color-dark2: rgb(28, 184, 158);
            --color-green1: #1dee70;
            --color-green2: rgb(34, 232, 119);
            --color-gray: #f5f5f5;
            --color-text: #333;
            --shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }

        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(135deg, #f5f7fa 0%, #e4e8eb 100%);
            min-height: 100vh;
            padding: 2rem;
            color: var(--color-text);
        }

        .container {
            max-width: 1200px;
            margin: 0 auto;
            background-color: var(--color-white);
            border-radius: 15px;
            box-shadow: var(--shadow);
            overflow: hidden;
            animation: fadeIn 0.5s ease;
        }

        @keyframes fadeIn {
            from { opacity: 0; transform: translateY(20px); }
            to { opacity: 1; transform: translateY(0); }
        }

        .header {
            background: linear-gradient(90deg, var(--color-green2), var(--color-green1));
            padding: 2rem;
            text-align: center;
            color: var(--color-white);
        }

        h1 {
            font-size: 2.2rem;
            margin-bottom: 0.5rem;
        }

        .subtitle {
            font-size: 1rem;
            opacity: 0.9;
        }

        .form-container {
            padding: 2rem;
        }

        .form-grid {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(280px, 1fr));
            gap: 1.5rem;
        }

        .inputs {
            width: 100%;
            padding: 12px 15px;
            border-radius: 8px;
            border: 1px solid #ddd;
            background-color: var(--color-white);
            font-size: 1rem;
            transition: all 0.3s ease;
        }

        .inputs:focus {
            border-color: var(--color-green1);
            box-shadow: 0 0 0 3px rgba(29, 238, 112, 0.2);
            outline: none;
        }

        .form-group {
            margin-bottom: 1rem;
        }

        .form-group label {
            display: block;
            margin-bottom: 0.5rem;
            font-weight: 500;
            color: var(--color-text);
        }

        select.inputs {
            cursor: pointer;
            appearance: none;
            background-image: url("data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' width='24' height='24' viewBox='0 0 24 24' fill='none' stroke='%23333' stroke-width='2' stroke-linecap='round' stroke-linejoin='round'%3E%3Cpath d='M6 9l6 6 6-6'/%3E%3C/svg%3E");
            background-repeat: no-repeat;
            background-position: right 12px center;
            background-size: 16px;
        }

        textarea.inputs {
            min-height: 120px;
            resize: vertical;
        }

        .submit-btn {
            background: linear-gradient(90deg, var(--color-green2), var(--color-green1));
            color: var(--color-white);
            border: none;
            padding: 14px 24px;
            border-radius: 8px;
            font-size: 1rem;
            font-weight: 600;
            cursor: pointer;
            width: 100%;
            margin-top: 1rem;
            transition: all 0.3s ease;
            box-shadow: 0 4px 6px rgba(34, 232, 119, 0.2);
        }

        .submit-btn:hover {
            background: linear-gradient(90deg, var(--color-green1), var(--color-green2));
            transform: translateY(-2px);
            box-shadow: 0 6px 12px rgba(34, 232, 119, 0.3);
        }

        .submit-btn:active {
            transform: translateY(0);
        }

        .form-section {
            border-bottom: 1px solid #eee;
            padding-bottom: 1.5rem;
            margin-bottom: 1.5rem;
        }

        .form-section-title {
            font-size: 1.2rem;
            margin-bottom: 1rem;
            color: var(--color-dark1);
            font-weight: 600;
        }

        @media (max-width: 768px) {
            .form-grid {
                grid-template-columns: 1fr;
            }
            
            .container {
                border-radius: 10px;
            }
            
            .header {
                padding: 1.5rem;
            }
            
            h1 {
                font-size: 1.8rem;
            }
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="header">
            <h1>Adicionar Novo Carro</h1>
            <p class="subtitle">Preencha os detalhes do veículo para cadastro</p>
        </div>
        
        <div class="form-container">
            <form action="adicao.jsp" method="POST">
                <div class="form-section">
                    <h2 class="form-section-title">Informações Básicas</h2>
                    <div class="form-grid">
                        <div class="form-group">
                            <label for="fabricante">Marca</label>
                            <input type="text" name="fabricante" id="fabricante" placeholder="Ex: Toyota" class="inputs" required>
                        </div>
                        <div class="form-group">
                            <label for="modelo">Modelo</label>
                            <input type="text" name="modelo" id="modelo" placeholder="Ex: Corolla" class="inputs" required>
                        </div>
                        <div class="form-group">
                            <label for="anoDeFabrico">Ano de Fabricação</label>
                            <input type="number" name="anoDeFabrico" id="anoDeFabrico" placeholder="Ex: 2023" class="inputs" required>
                        </div>
                        <div class="form-group">
                            <label for="matricula">Matrícula</label>
                            <input type="text" name="matricula" id="matricula" placeholder="Ex: ABC-1234" class="inputs" required>
                        </div>
                    </div>
                </div>
                
                <div class="form-section">
                    <h2 class="form-section-title">Características</h2>
                    <div class="form-grid">
                        <div class="form-group">
                            <label for="categoria">Categoria</label>
                            <select name="categoria" id="categoria" class="inputs" required>
                                <option value="" disabled selected>Selecione uma categoria</option>
                                <option value="SUV">SUV</option>
                                <option value="OFF-ROAD">Off-Road</option>
                                <option value="luxo">Luxo</option>
                                <option value="van">Van</option>
                                <option value="pickUp">Pick-Up</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="tipoDeComustivel">Tipo de Combustível</label>
                            <select name="tipoDeComustivel" id="tipoDeComustivel" class="inputs" required>
                                <option value="" disabled selected>Selecione o combustível</option>
                                <option value="Gasolina">Gasolina</option>
                                <option value="Gas">Gás</option>
                                <option value="Disel">Diesel</option>
                                <option value="Eletrico">Elétrico</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="cor">Cor</label>
                            <select name="cor" id="cor" class="inputs" required>
                                <option value="" disabled selected>Selecione uma cor</option>
                                <option value="Branco">Branco</option>
                                <option value="Preto">Preto</option>
                                <option value="Roxo">Roxo</option>
                                <option value="Prata">Prata</option>
                                <option value="Amarelo">Amarelo</option>
                                <option value="Gray">Cinza</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="tracao">Transmissão</label>
                            <select name="tracao" id="tracao" class="inputs" required>
                                <option value="" disabled selected>Selecione a transmissão</option>
                                <option value="Manual">Manual</option>
                                <option value="Automatico">Automático</option>
                                <option value="hibrido">Híbrido</option>
                            </select>
                        </div>
                    </div>
                </div>
                
                <div class="form-section">
                    <h2 class="form-section-title">Detalhes Técnicos</h2>
                    <div class="form-grid">
                        <div class="form-group">
                            <label for="quilometosPercoridos">Quilômetros Percorridos</label>
                            <input type="number" name="quilometosPercoridos" id="quilometosPercoridos" placeholder="Ex: 15000" class="inputs" required>
                        </div>
                        <div class="form-group">
                            <label for="preco">Preço (R$)</label>
                            <input type="number" name="preco" id="preco" placeholder="Ex: 75000" class="inputs" required>
                        </div>
                        <div class="form-group">
                            <label for="assentos">Número de Assentos</label>
                            <input type="number" name="assentos" id="assentos" placeholder="Ex: 5" class="inputs" required>
                        </div>
                        <div class="form-group">
                            <label for="km_litro">Consumo (km/litro)</label>
                            <input type="number" name="km_litro" id="km_litro" placeholder="Ex: 12" class="inputs" required>
                        </div>
                    </div>
                </div>
                
                <div class="form-section">
                    <h2 class="form-section-title">Descrição</h2>
                    <div class="form-group">
                        <label for="descricao">Descrição Detalhada</label>
                        <textarea name="descricao" id="descricao" class="inputs" placeholder="Descreva as características e estado do veículo..." rows="5" required></textarea>
                    </div>
                </div>
                
                <button type="submit" class="submit-btn">Adicionar Veículo</button>
            </form>
        </div>
    </div>

    <script>
        // Add some basic form validation and animations
        document.addEventListener('DOMContentLoaded', function() {
            const inputs = document.querySelectorAll('.inputs');
            
            inputs.forEach(input => {
                // Add focus animation
                input.addEventListener('focus', function() {
                    this.parentElement.classList.add('focused');
                });
                
                input.addEventListener('blur', function() {
                    this.parentElement.classList.remove('focused');
                });
                
                // Simple validation - highlight fields when filled
                input.addEventListener('input', function() {
                    if(this.value.trim() !== '') {
                        this.classList.add('filled');
                    } else {
                        this.classList.remove('filled');
                    }
                });
            });
            
            // Form submission animation
            const form = document.querySelector('form');
            form.addEventListener('submit', function(e) {
                const submitBtn = document.querySelector('.submit-btn');
                submitBtn.textContent = 'Enviando...';
                submitBtn.style.opacity = '0.8';
                
                // This would be removed in production, just for demo purposes
                // to show the button animation
                if (!form.checkValidity()) {
                    setTimeout(() => {
                        submitBtn.textContent = 'Adicionar Veículo';
                        submitBtn.style.opacity = '1';
                    }, 1000);
                }
            });
        });
    </script>
</body>
</html>
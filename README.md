# 🌐 Web MVC — Aplicação CRUD com Spring Boot, Thymeleaf e JPA

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-Template%20Engine-blue)
![License](https://img.shields.io/badge/License-Educacional-lightgrey)

> 💻 Projeto acadêmico desenvolvido para a disciplina **Desenvolvimento de Sistemas Web (DSW)** —  
> Curso **Análise e Desenvolvimento de Sistemas | Senac**    
> Ano/Semestre: **2025/3**

---

## 📘 Descrição Geral

O projeto **Web MVC** é uma aplicação web completa baseada no padrão **Model–View–Controller (MVC)**, desenvolvida em **Spring Boot** com **Thymeleaf** e **Spring Data JPA**.

A aplicação implementa um **CRUD completo (Create, Read, Update, Delete)** com:
- Interface dinâmica e responsiva;
- Integração com banco de dados relacional;
- Validação de dados;
- Upload de arquivos;
- Autenticação básica via Spring Security.

O objetivo é consolidar os conceitos de **desenvolvimento web full-stack** com **Java + Spring**.

---

## ⚙️ Tecnologias Utilizadas

| Camada | Tecnologias |
|--------|--------------|
| **Back-end** | Java 21, Spring Boot 3.x, Spring MVC, Spring Data JPA, Spring Security |
| **Front-end** | Thymeleaf, HTML5, CSS3, JavaScript (Fetch API) |
| **Banco de Dados** | H2 Database (em memória) |
| **Build e Execução** | Maven, IntelliJ IDEA / VSCode |

---

## 🚀 Funcionalidades Implementadas

✅ CRUD completo (criar, listar, editar e excluir registros)  
✅ Validação de dados com Bean Validation (Jakarta Validation)  
✅ Upload de arquivos (armazenamento de nome no banco)  
✅ API REST com endpoints JSON  
✅ Integração com banco via JPA (ORM)  
✅ Autenticação básica com Spring Security  
✅ Frontend dinâmico com Thymeleaf  
✅ Console H2 para visualização dos dados  

---



---

## 🌍 Rotas da Aplicação

### 🔹 Páginas Thymeleaf (interface visual)
| Página | URL | Descrição |
|---------|-----|-----------|
| Página inicial | `http://localhost:8080/` | Redireciona para `/dados` |
| Lista de cadastros | `http://localhost:8080/dados` | Exibe registros cadastrados |
| Novo cadastro | `http://localhost:8080/dados/novo` | Formulário de novo registro |
| Detalhes / Edição | `http://localhost:8080/dados/{id}` | Exibe e permite editar |
| Excluir | `http://localhost:8080/dados/excluir/{id}` | Remove registro existente |

### 🔹 API REST (formato JSON)
| Método | Endpoint | Descrição |
|--------|-----------|-----------|
| **GET** | `/api/dados` | Retorna lista completa de registros |
| **GET** | `/api/dados/{id}` | Retorna registro específico |
| **POST** | `/api/dados` | Cria novo registro |
| **PUT** | `/api/dados/{id}` | Atualiza registro existente |
| **DELETE** | `/api/dados/{id}` | Exclui registro |
| **POST** | `/api/dados/upload` | Cria novo registro com upload de arquivo |

---

## 💾 Banco de Dados (H2)

O sistema utiliza o **H2 Database** em memória, configurado automaticamente.

🔗 **Console H2:** [http://localhost:8080/h2-console](http://localhost:8080/h2-console)  
🧱 **JDBC URL:** `jdbc:h2:mem:testdb`  
👤 **Usuário:** `sa`  
🔒 **Senha:** *(vazia)*  

---

## 🔐 Autenticação e Segurança

A aplicação utiliza **Spring Security** com configuração moderna via `SecurityFilterChain`.

Durante o desenvolvimento, as rotas principais (`/dados`, `/api/**`, `/h2-console/**`) estão liberadas.  
Ao ativar o modo de produção, pode-se exigir login e senha conforme necessidade.

---

## 🧭 Como Executar o Projeto

### 🔹 Pré-requisitos
- Java **JDK 21+**
- Maven 3.8+
- IDE (IntelliJ, Eclipse, ou VSCode com extensão Spring Boot)

### 🔹 Execução via Maven
```bash
mvn spring-boot:run
```

### 🔹 Acesso no navegador
http://localhost:8080/


---

## 🧠 Conceitos Aplicados

- Arquitetura **Model–View–Controller (MVC)**
- Injeção de dependência com **Spring IoC**
- Mapeamento objeto-relacional com **JPA/Hibernate**
- Serialização e desserialização **JSON com Jackson**
- **Validação de dados** via anotações (`@NotBlank`, `@Email`, `@Past`, etc.)
- Controle de rotas **RESTful**
- Renderização **server-side com Thymeleaf**

---


**Silmara Vasconcelos**   
🎓 *Faculdade Senac – Curso de Análise e Desenvolvimento de Sistemas*  
📘 *Disciplina:* Desenvolvimento de Sistemas Web (DSW)  
📅 *Semestre:* 2025/3  
👨‍🏫 *Prof. Dr. Alexandre*













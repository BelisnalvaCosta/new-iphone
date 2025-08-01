
# 📱 Projeto My iPhone Web

Este projeto simula um iPhone com funcionalidades de música, telefone e navegador, implementado em **Java** com base em **Programação Orientada a Objetos** e 
complementado com uma **interface gráfica web moderna e interativa**.[^1]

---

## 📌 Objetivo

Demonstrar, de forma prática, conceitos de Orientação a Objetos aplicados a um dispositivo virtual (iPhone), utilizando:
- Diagrama de Classes UML
- Implementação Java
- Interface gráfica HTML/CSS/JS

---

## 🧠 Diagrama UML

O projeto foi modelado com o seguinte **Diagrama de Classes**:

- **Main**: Classe de entrada da aplicação.
- **IPhone**: Classe concreta que implementa três interfaces:
  - `ReprodutorMusical`
  - `AparelhoTelefonico`
  - `NavegadorInternet`

Cada interface define responsabilidades específicas:
- 🎵 `ReprodutorMusical`: tocar, pausar, selecionar e parar música.
- 📞 `AparelhoTelefonico`: ligar, atender e acessar correio de voz.
- 🌐 `NavegadorInternet`: exibir, atualizar páginas e abrir novas abas.

---

## 🧾 Classes Java

O código Java reflete diretamente o diagrama UML com:

### ✅ Classe `IPhone`
Implementa as três interfaces e contém os seguintes atributos:
- `musicaAtual: String`
- `paginaAtual: String`
- `chamadaAtiva: boolean`
- `musicaTocando: boolean`

Com métodos que simulam ações como:
```java
tocar(), pausar(), ligar(numero), atender(), exibirPagina(url) etc.
```

### ✅ Interfaces
- `ReprodutorMusical`
- `AparelhoTelefonico`
- `NavegadorInternet`

### ✅ Classe `Main`
Executa a aplicação e utiliza a classe `IPhone`.

---

## 💻 Interface Gráfica Web

Criada com **HTML5**, **CSS3** e **JavaScript**, com foco em responsividade e interatividade.

### Componentes da UI:

- 🎧 **Music Player**  
  Input + botões: Play, Pause, Stop

- 📞 **Phone**  
  Input + botões: Ligar, Atender

- 🌐 **Web Browser**  
  Input + botões: Abrir URL, Atualizar

- 📖 **Cartões de Versículos**  
  Versículos bíblicos decorativos e inspiradores

### Estilo:
- Design moderno com **Glassmorphism** (fundo translúcido)
- Ícones com **Font Awesome 6**
- Layout responsivo para desktop e dispositivos móveis

---

## 🚀 Conclusão

O projeto unifica modelagem UML, lógica em Java e experiência gráfica em um único sistema funcional. Ideal para estudos de:
- Orientação a Objetos
- Interface web integrada a sistemas Java
- Boas práticas de design e usabilidade

---

> © 2025 My iPhone Web. Todos os direitos reservados.

[^1]: Bootcamp Santander Back-end professor Gleyson Sampaio (DIO).

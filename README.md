# old_robotic_arm

Braço Robotico em 3D construido em Java old version

Os arquivos contém um conjunto de classes Java utilizadas para a simulação gráfica de um braço  robótico em um ambiente de Applet versão legada.

O código foi desenvolvido como parte de um projeto acadêmico na  **Universidade Estadual do Sudoeste da Bahia (UESB)** , especificamente para a disciplina de  **Computação Gráfica por Hugo Santos Dias e a participação especial de Bruno Boa Ventura**. Professor: Bruno Silvério Costa


### **Prova da Terceira - Unidade de Computação Gráfica**

## **Pequeno tutorial sobre o fontes do Braço Robô (Arm Robot)**

*Obs: Os dois principais arquivos do projeto são matrix.java e point3d.java, pois são os arquivos que armazenam e tratam os valores do desenho.*

*O desenho foi um braço robô, porem poderia ser qualquer outro o principio de desenhar, mover, transpor, escala, e outras funções em 3d pode ser aplicado a qualquer desenho, basta usar os arquivos matrix.java e point3d.java.*

### **Resumo do código**

1. **Robot.java**
   – Classe principal que inicializa a simulação e gerencia a interface gráfica do applet.
2. **Base.java**
   – Representa a base fixa do braço robótico.
3. **Cubo.java**
   – Define um cubo tridimensional, provavelmente um objeto de referência ou parte do cenário.
4. **H.java**
   – Possivelmente um objeto gráfico em forma de "H", usado para alguma marcação ou referência.
5. **Joint.java,
   Joint2.java, Joint3.java** – Representam as juntas do braço robótico, permitindo movimentação segmentada.
6. **Matrix.java**
   – Manipula matrizes para transformações tridimensionais (rotação e translação).
7. **Pincer.java**
   – Define a pinça do braço robótico, permitindo interação com objetos.
8. **Point3d.java**
   – Classe de pontos 3D usada para representar coordenadas tridimensionais.
9. **Pyramid.java**
   – Representa uma pirâmide, possivelmente parte da pinça ou um objeto gráfico.
10. **Screen.java**
    – Gerencia a projeção da cena 3D em um espaço 2D (viewport).
11. **Shape.java**
    – Classe abstrata para definição de formas geométricas.
12. **Support.java**
    – Representa o suporte do braço robótico.
13. **World.java**
    – Classe que define o mundo gráfico onde os objetos são renderizados.

**Principais funcionalidades**

* Renderização do braço robótico com projeção 3D em um Applet Java.
* Interação via **mouse** (movimentação do braço) e **teclado** (controle dos ângulos das juntas).
* Uso de **transformações lineares** (rotações e translações) para manipulação dos componentes do robô.
* **Threading** para atualização contínua da simulação.

O código utiliza  **Java Applet** , que foi  **removido a partir do Java 17** . Para rodá-lo em versões mais recentes, você precisará **remover a dependência de Applet** e migrar para uma biblioteca gráfica moderna, como **JavaFX** ou **Swing** .

## **Teclas de atalho e movimentação do braço e da viewport:**

*public static final int 1006: //**left** “movimentar para a esquerda”*
*public static final int 1007: //**rigth** “movimentar para a direita”*
*public static final int 1000: //**home** “movimenta o ”*

*public static final int 1001: //**ACTION_EVENT***
*public static final int 1005: //**LOST_FOCUS***
*public static final int 1004: //**GO T_FOCUS***
*public static final int 1002: //**PGUP** “levanta o braço”*
*public static final int 1003: //**PGDN** “abaixa o braço”*

*public static final int 42: // '*' “abre a pinça”*
*public static final int 47: // '**/**' “fecha a pinça”*
*public static final int 54: // '**6**' gira em torno de y*
*public static final int 52: // '**4**' gira em torno de y*
*public static final int 50: // '**2**' gira em torno de x*
*public static final int 56: // '**8**' gira em torno de x*
*public static final int 57: // '**9**' gira em torno de z*
*public static final int 51: // '**3**' gira em torno de z*
*public static final int 55: // '**7**' “diminui o zoom”*
*public static final int 49: // '**1**' “aumenta o zoom”*
*public static final int 1008: //**F1** “visão do view por baixo”*
*public static final int 1009: //**F2** “visão do view por cima”*
*public static final int 1010: //**F3** “visão do view pela diagonal – por cima”*
*public static final int 1011: //**F4** “visão do view pela diagonal – por baixo”*
*public static final int 1012: //**F5** “visão do view original do ponto 0,0,0”*

*public static final int 1012: //**F6** “giro sobre x”*
*public static final int 1012: //**F7** “visão do view por cima e na diagonal”*

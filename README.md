# old_robotic_arm

Braço Robotico em 3D construido em Java old version

Os arquivos contém um conjunto de classes Java utilizadas para a simulação gráfica de um braço  robótico em um ambiente de Applet versão legada.

O código foi desenvolvido como parte de um projeto acadêmico na  **Universidade Estadual do Sudoeste da Bahia (UESB)** , especificamente para a disciplina de  **Computação Gráfica por Hugo Santos Dias e a participação especial de Bruno Boa Ventura**.

**Resumo do código**

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

O código utiliza  **Java Applet** , que foi  **removido a
partir do Java 17** . Para rodá-lo em versões mais recentes, você precisará **remover
a dependência de Applet** e migrar para uma biblioteca gráfica moderna, como **JavaFX**
ou  **Swing** .

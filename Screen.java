/* UNIVERSIDADE ESTADUAL DO SUDOESTE DA BAHIA
 * Ci�ncia da Computa��o
 * Disciplina: Computa��o Gr�fica
 * Alunos: Bruno Boaventura de Oliveira Lacerda
 *         Hugo Santos Dias
 * Professor: Bruno Silv�rio Costa
 */


//rota��o da tela de apresenta��o do viewport

class Screen
{

    void Project(Point3d pt)
    {
        x = ((int)pt.x * Robot.appletHeight) / (int)pt.z + Robot.appletWidth / 2;
        y = ((int)pt.y * Robot.appletHeight) / (int)pt.z + Robot.appletHeight / 2;
    }

    Screen()
    {
    }

    int x;
    int y;
}
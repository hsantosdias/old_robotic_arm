/* UNIVERSIDADE ESTADUAL DO SUDOESTE DA BAHIA
 * Ci�ncia da Computa��o
 * Disciplina: Computa��o Gr�fica
 * Alunos: Bruno Boaventura de Oliveira Lacerda
 *         Hugo Santos Dias
 * Professor: Bruno Silv�rio Costa
 */


//classe mundo onde se encontra todos os objetos

class World extends Shape
{

    void Draw(Matrix viewmatold, Point3d relpt)
    {
        Matrix viewmat = viewmatold.copy();
    	Cubo obj1 = new Cubo();
		DoPoint(0, viewmat, relpt, -300, 150, 0);
		obj1.Draw(viewmat, super.points[0]);
		Base obj = new Base();
        DoPoint(0, viewmat, relpt, 0, 155, 0);
        obj.Draw(viewmat, super.points[0]);
 	}

    World()
    {
    }

}

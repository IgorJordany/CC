#include <GL/glut.h> 

void desenhaGrade()
{
    glColor3f(0.8f,0.8f,0.8f);
    glLineWidth(1.0f);
    glBegin(GL_LINES);
    float x = -2;
    for(;x<=25; x++)
    {
        glVertex2f(-2,x);
        glVertex2f( 25,x);
        glVertex2f(x,-2);
        glVertex2f(x, 25);
    }
    glEnd();
    glColor3f(1.0f,0.0f,0.0f);
    glLineWidth(3.0f);
    glBegin(GL_LINES);

    glVertex2f( 25,-2);

    glVertex2f(-2, 25);
    glEnd();
} 

// Função call back chamada para fazer o desenho
void DesenhaNaTela(void)
{
    glClear(GL_COLOR_BUFFER_BIT); 

    glColor3f(0.0f, 0.0f, 0.0f); // vermelho
    glPointSize(20.0f); // aumenta o tamanho dos pontos
    glBegin(GL_POINTS);        
        glVertex2f(10, 14);
        glVertex2f(11, 14);
        glVertex2f(12, 14);
        glVertex2f(13, 14);
        glVertex2f(9, 13);
        glVertex2f(10, 13);
        glVertex2f(11, 13);
        glVertex2f(12, 13);
        glVertex2f(13, 13);
        glVertex2f(14, 13);
        glVertex2f(1, 12);
        glVertex2f(2, 12);
        glVertex2f(3, 12);
        glVertex2f(4, 12);
        glVertex2f(5, 12);
        glVertex2f(6, 12);
        glVertex2f(7, 12);
        glVertex2f(8, 12);
        glVertex2f(9, 12);
        glVertex2f(10, 12);
        glVertex2f(14, 12);
        glVertex2f(15, 12);
        glVertex2f(16, 12);
        glVertex2f(17, 12);
        glVertex2f(18, 12);
        glVertex2f(19, 12);
        glVertex2f(20, 12);
        glVertex2f(21, 12);
        glVertex2f(22, 12);
        glVertex2f(23, 12);
        glVertex2f(1, 11);
        glVertex2f(9, 11);
        glVertex2f(10, 11);
        glVertex2f(14, 11);
        glVertex2f(15, 11);
        glVertex2f(23, 11);
        glVertex2f(1, 10);
        glVertex2f(2, 10);
        glVertex2f(3, 10);
        glVertex2f(4, 10);
        glVertex2f(5, 10);
        glVertex2f(6, 10);
        glVertex2f(7, 10);
        glVertex2f(8, 10);
        glVertex2f(9, 10);
        glVertex2f(10, 10);
        glVertex2f(14, 10);
        glVertex2f(15, 10);
        glVertex2f(16, 10);
        glVertex2f(17, 10);
        glVertex2f(18, 10);
        glVertex2f(19, 10);
        glVertex2f(20, 10);
        glVertex2f(21, 10);
        glVertex2f(22, 10);
        glVertex2f(23, 10);
        glVertex2f(2, 9);
        glVertex2f(9, 9);
        glVertex2f(10, 9);
        glVertex2f(11, 9);
        glVertex2f(12, 9);
        glVertex2f(13, 9);
        glVertex2f(14, 9);
        glVertex2f(23, 9);
        glVertex2f(2, 8);
        glVertex2f(10, 8);
        glVertex2f(11, 8);
        glVertex2f(12, 8);
        glVertex2f(13, 8);
        glVertex2f(22, 8);
        glVertex2f(2, 7);
        glVertex2f(22, 7);
        glVertex2f(3, 6);
        glVertex2f(21, 6);
        glVertex2f(3, 5);
        glVertex2f(4, 5);
        glVertex2f(21, 5);
        glVertex2f(4, 4);
        glVertex2f(20, 4);
        glVertex2f(5, 3);
        glVertex2f(6, 3);
        glVertex2f(18, 3);
        glVertex2f(19, 3);
        glVertex2f(7, 2);
        glVertex2f(8, 2);
        glVertex2f(17, 2);
        glVertex2f(18, 2);
        glVertex2f(9, 1);
        glVertex2f(10, 1);
        glVertex2f(11, 1);
        glVertex2f(12, 1);
        glVertex2f(13, 1);
        glVertex2f(14, 1);
        glVertex2f(15, 1);
        glVertex2f(16, 1);
    glEnd(); 
    glColor3f(1.0f, 0.0f, 0.0f); // vermelho
    glBegin(GL_POINTS);
        glVertex2f(10, 22);
        glVertex2f(11, 22);
        glVertex2f(12, 22);
        glVertex2f(13, 22);
        glVertex2f(14, 22);
        glVertex2f(7, 21);
        glVertex2f(8, 21);
        glVertex2f(9, 21);
        glVertex2f(15, 21);
        glVertex2f(16, 21);
        glVertex2f(6, 20);
        glVertex2f(17, 20);
        glVertex2f(18, 20);
        glVertex2f(5, 19);
        glVertex2f(18, 19);
        glVertex2f(19, 19);
        glVertex2f(4, 18);
        glVertex2f(20, 18);
        glVertex2f(3, 17);
        glVertex2f(21, 17);
        glVertex2f(3, 16);
        glVertex2f(21, 16);
        glVertex2f(2, 15);
        glVertex2f(22, 15);
    	glVertex2f(2, 14);
    	glVertex2f(22, 14);
        glVertex2f(1, 13);
        glVertex2f(22, 13);
        glVertex2f(23, 13);
    glEnd();
    glutSwapBuffers();
} 

// Inicializa parâmetros de rendering
void Inicializa (void)
{
    glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    gluOrtho2D(-2,25,-2,25);
    glMatrixMode(GL_MODELVIEW); 
} 

// Programa principal 

int main(int argc, char** argv)
{
    glutInit(&argc,argv);
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
    glutInitWindowSize(500,500);
    glutInitWindowPosition(100,100);
    glutCreateWindow("Primeiro Programa em OpenGL");
    glutDisplayFunc(DesenhaNaTela);
    Inicializa();
    glutMainLoop();
}



/*

TABLE COLORS
R   G   B   result
1.0 0.0 0.0 red, duh
0.0 1.0 0.0 green, duh
0.0 0.0 1.0 blue, duh
1.0 1.0 0.0 yellow
1.0 0.0 1.0 purple
0.0 1.0 1.0 cyan
1.0 1.0 1.0 white
 
1.0 0.5 0.0 orange
0.5 1.0 0.0 greenish yellow
...
0.5 1.0 0.5 light green
0.0 0.5 0.0 dark green
...

gcc -o fonte fonte.c -lglut -lGL -lGLU -lm

*/
#include <GL/glut.h>  
#include <stdio.h>

int cor;
int xa;
int ya;
int xb;
int yb;
int trans;

void desenhaGrade()
{
    glColor3f(0.8f,0.8f,0.8f);
    glLineWidth(1.0f);
    glBegin(GL_LINES);
    float x = -10;
    for(;x<=10; x++)
    {
        glVertex2f(-10,x);
        glVertex2f( 10,x);
        glVertex2f(x,-10);
        glVertex2f(x, 10);
    }
    glEnd();
    glColor3f(0.0f,0.0f,0.0f);
    glLineWidth(3.0f);
    glBegin(GL_LINES);
    glVertex2f(-10,0);
    glVertex2f( 10,0);
    glVertex2f(0,-10);
    glVertex2f(0, 10);
    glEnd();
}

// Função call back chamada para fazer o desenho
void DesenhaNaTela(void)
{	
    glClear(GL_COLOR_BUFFER_BIT); 
    switch(cor)
	{
		case 1:
			glColor3f(0.0f, 0.0f, 0.0f); // preto
        break;
		case 2:
			glColor3f(1.0f, 0.0f, 0.0f); // vermelho
        break;
		case 3:
		 	glColor3f(0.0f, 0.0f, 1.0f); // azul
        break;
		case 4:
			glColor3f(1.0f, 1.0f, 0.0f); // amarelo
        break;
		case 5:
			glColor3f(1.0f, 0.0f, 1.0f); // roxo
        break;
		 	
	}
	glLineWidth(3.0f);  // aumenta a espessura das linhas
	glBegin(GL_LINE_STRIP);
    	glVertex2f(xa,ya);
    	glVertex2f(xb,yb);
	glEnd();
    glLineWidth(3.0f);  // aumenta a espessura das linhas
    glBegin(GL_LINE_STRIP);
        glVertex2f(xa+trans,ya+trans);
        glVertex2f(xb+trans,yb+trans);
    glEnd();
    glutSwapBuffers();
} 

// Inicializa parâmetros de rendering
void Inicializa (void) 
{
    glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    gluOrtho2D(-10,10,-10,10);
    glMatrixMode(GL_MODELVIEW); 

} 

// Programa principal 

int main(int argc, char** argv)
{
	printf("Digite o número da cor: 1 - preto | 2 - vermelho | 3 - azul | 4 - amarelo | 5 - roxo \n");
	scanf("%d", &cor);

	printf("Digite a coordenada do ponto 1 da reta (x enter y) entre (-10,10): \n");
	scanf("%d %d", &xa, &ya);
	printf("Digite a coordenada do ponto 2 da reta (x enter y) entre (-10,10): \n");
	scanf("%d %d", &xb, &yb);
    printf("Digite a translação da reta: ");
    scanf("%d", &trans);

    glutInit(&argc,argv);
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
    glutInitWindowSize(500,500);
    glutInitWindowPosition(100,100);
    glutCreateWindow("Reta Translação");
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
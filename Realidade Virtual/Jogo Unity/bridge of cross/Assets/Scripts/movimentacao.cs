using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class movimentacao : MonoBehaviour
{

    public float VelocidadeDeMovimento = 3;
    public float VelocidadeDeRotacao = 120;
    public Animator ControladorDeAnimacao;

    private void Start()
    {
        ControladorDeAnimacao = GetComponent<Animator>();
    }

    // Update is called once per frame
    void Update()
    {

        float Horizontal = Input.GetAxis("Horizontal") * VelocidadeDeRotacao * Time.deltaTime;
        transform.Rotate(0, Horizontal, 0);
        float Vertical = Input.GetAxis("Vertical") * VelocidadeDeMovimento * Time.deltaTime;
        transform.Translate(0, 0, Vertical);

        IniciaAnimacao(Horizontal, Vertical);
    }
    private void IniciaAnimacao(float horizontal, float vertical)
    {
        bool walking = horizontal != 0 || vertical != 0;

        ControladorDeAnimacao.SetBool("andando", walking);
    }
}
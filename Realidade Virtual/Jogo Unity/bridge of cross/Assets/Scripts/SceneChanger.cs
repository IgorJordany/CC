using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class SceneChanger : MonoBehaviour
{

    // Update is called once per frame

    public void OnCollisionEnter(Collision collision)
    {
        if (collision.gameObject.tag == "muda")
        {
            SceneManager.LoadScene(1);
        }
    }
}
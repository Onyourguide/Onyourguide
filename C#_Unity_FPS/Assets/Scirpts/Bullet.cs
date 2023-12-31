using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Bullet : MonoBehaviour
{
    public float Speed = 0.5f;
    public float secondUntilDestroy = 1.2f;
    float startTime;
    void Start()
    {
        startTime = Time.time;
    }


    void Update()
    {
        this.gameObject.transform.position += Speed* this.gameObject.transform.forward;
        if(Time.time - startTime >= secondUntilDestroy ) 
        { 
            Destroy( this.gameObject );
        }
    }
}

using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class MovementCamrera : MonoBehaviour
{
    public float moveSpeed = 1f;

    void Update()
    {
        transform.RotateAround(transform.position,Vector3.up, moveSpeed*Input.GetAxis("Mouse X"));
        transform.RotateAround(transform.position,-transform.right, moveSpeed * Input.GetAxis("Mouse Y"));
    }
}

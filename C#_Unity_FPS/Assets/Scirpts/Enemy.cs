using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.AI;
public class Enemy : MonoBehaviour
{
    Transform targetPlayer;
    public string tagObject;
    Animator animator;
    NavMeshAgent navMeshAgent;
    void Start()
    {
        animator = GetComponent<Animator>();
        navMeshAgent = GetComponent<NavMeshAgent>();
        if (targetPlayer == null)
        {
            GameObject[] targetPlayer = GameObject.FindGameObjectsWithTag("Player");
        }
    }

    void Update()
    {
        navMeshAgent.destination = targetPlayer.position;
    }

    void OnTriggerEnter(Collider other)
    {
        if(other.gameObject.tag == tagObject)
        {
            animator.SetTrigger("Death");
            Destroy(other.gameObject);
            navMeshAgent.isStopped = true;
            StartCoroutine(clearObject());
        }
    }

    private void StartCoroutine(IEnumerable enumerable)
    {
        throw new NotImplementedException();
    }

    IEnumerable clearObject()
    {
        yield return new WaitForSeconds(2f);
        Destroy(this.gameObject);
    } 
}

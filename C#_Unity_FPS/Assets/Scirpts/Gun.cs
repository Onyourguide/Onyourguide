using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Gun : MonoBehaviour
{
    public GameObject bullet,flashMuzzle;
    public float nextFire = 0.0f;
    public float fireRate = 0.1f;
    void Start()
    {
        flashMuzzle.SetActive(false); // ซ่อนไว้
    }

    // Update is called once per frame
    void Update()
    {
        if (Input.GetMouseButton(0) && Time.time > nextFire)
        {
            nextFire = Time.time + fireRate;
            Fire();
            flashMuzzle.SetActive(true);
            StartCoroutine(HideMuzzle(0.12f));
        }
    }
    public void Fire()
    {
        Instantiate(bullet,transform.position,transform.rotation);

    }

    IEnumerator HideMuzzle(float SecondUntilDestroy)
    {
        yield return new WaitForSeconds(SecondUntilDestroy);
        flashMuzzle.SetActive(false);
    }
}

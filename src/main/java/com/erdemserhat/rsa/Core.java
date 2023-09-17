package com.erdemserhat.rsa;

import java.math.BigInteger;

public class Core {
    /**
     * @implSpec Key Generation
     *
     * The keys for the RSA algorithm are generated in the following way:
     * 1. Choose two large prime numbers p and q.
     * --To make factoring harder, p and q should be chosen at random,
     * be both large and have a large difference.
     * For choosing them the standard method is to choose random integers and use a primality test
     * until two primes are found.
     * --p and q should be kept secret.
     *
     * 2. Compute n = pq
     * --n is used as the modulus for both the public and private keys.
     * Its length, usually expressed in bits, is the key length.
     * --n is released as part of the public key.
     *
     * 3.Compute l= lcm(p-1,q-1)=(p-1)*(q-1)
     * --l is kept secret.
     *
     * 4.Choose an integer e such that 2<e<l and gcd(e,l)=1 in other words, e and l are coprime.
     * --e having a short bit-length and small Hamming weight results in more efficient encryption.
     * The most commonly chosen value for e is 2^16 +1 =65 537. The smallest (and fastest) possible values for e is 3,
     * but such a small value for e has been shown to be less secure in some settings.
     *
     * 5.Determine d as d≡e^-1 (mod l); that is, d is the modular
     * This means: solve for d the equation de ≡ 1 (mod λ(n)); d can be computed
     * efficiently by using the extended Euclidean algorithm, since, thanks to e and λ(n) being coprime,
     * said equation is a form of Bézout's identity, where d is one of the coefficients.
     *--d is kept secret as the private key exponent.
     *
     */


    //p and q must be prime.
    private BigInteger p;
    private BigInteger q;
    //n=p*q, (n will be used as mod value.)
    private BigInteger n;
    //t=(p-1)*(q-1) (totient function)
    private BigInteger l;
    //l =lambda
    //1<e<l, e and t must not divide each other.
    //e =public key
    //bit length of e should be short.
    //hamming weight of e should be little.
    //(commonly 0x10001 = 65,537) provide more efficient encryption.
    private BigInteger e;
    //d*e=1 (mod t)
    //d=special key power.
    private BigInteger d;
    //message represents data which should be kept secure.
    private BigInteger message;
    //encryptedMessage represents data which is encrypted.
    private BigInteger encryptedMessage;


    public Core() {
    }
}

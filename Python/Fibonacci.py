import numpy as np
from math import sqrt


# Fibonacci version 1 in exponential time. 
# The running time of fib1(n) is proportional to 2^(0.69n) ~ (1.6)^n, so it takes 1.6 times longer to compute Fn+1 than Fn.
def fib1(n):
    if n == 0: return 0
    if n == 1: return 1
    return fib1(n-1) + fib1(n-2)


# Fibonacci version 2 in linear time (Polynomial)
# Why is fib1(n) so slow? because many computations are repeated during the recursion. A more sensible scheme would store the intermediate results, the value of F0.....Fn-1 to an array as soon as they are know so that they don't have to be recomputed during each recursion call.
def fib2(n):
    if n==0: return 0
    f = np.zeros(n+1, dtype=np.int) # Creates an array holds F0 to Fn
    f[0] = 0
    f[1] = 1
    for i in range(2, n+1): # Loops from f2 to fn (range is exclusive on the 2nd argument)
        f[i] = f[i-1] + f[i-2]
    return f[n]


# Fibonacci version 3 in constant time.
# Of course, the fastest is using Binet's Fibonacci Number Formula: http://mathworld.wolfram.com/BinetsFibonacciNumberFormula.html
def fib3(n):
    return ((1+sqrt(5))**n-(1-sqrt(5))**n)/(2**n*sqrt(5))

# Tests
print "fib1(10) = " + str(fib1(10))
print "fib2(10) = " + str(fib2(10))
print "fib3(10) = " + str(fib3(10))
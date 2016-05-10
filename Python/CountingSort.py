def find_kth_smallest_in_union_AB(A, B, k):
    if k >= len(A) + len(B):
        raise IndexError('list index out of range')
    while k > 0:
        m = (k - 1) / 2
        if m >= len(A):
            B = B[m + 1:]
        elif m >= len(B) or A[m] <= B[m]:
            A = A[m + 1:]
        else:
            B = B[m + 1:]
        k -= m + 1
    if len(A) == 0:
        return B[0]
    if len(B) == 0:
        return A[0]
    return min(A[0], B[0])


# Tests
A = [1, 2, 6, 7]
B = [3, 4, 5, 10]

print "The 0th smallest element in the union of A B is " + str(find_kth_smallest_in_union_AB(A, B, 0))

print "The 5th smallest element in the union of A B is " + str(find_kth_smallest_in_union_AB(A, B, 5))
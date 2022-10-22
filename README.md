# Quick-Find-disjoint-set-implementations

Time Complexity
Union-find Constructor	Find	Union	Connected
Time Complexity	O(N)O(N)	O(1)O(1)	O(N)O(N)	O(1)O(1)


Note: NN is the number of vertices in the graph.

When initializing a union-find constructor, we need to create an array of size NN with the values equal to the corresponding array indices;
this requires linear time.
Each call to find will require O(1)O(1) time since we are just accessing an element of the array at the given index.
Each call to union will require O(N)O(N) time because we need to traverse through the entire array and update the root vertices for all the
vertices of the set that is going to be merged into another set.
The connected operation takes O(1)O(1) time since it involves the two find calls and the equality check operation.
Space Complexity
We need O(N)O(N) space to store the array of size NN.

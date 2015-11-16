TACTICAL BEHAVIOR BACKPROPAGATING ALGORITHM
TBBBA
Walter Gress
November, 2015



This piece of software is under sole ownership of Walter Gress
It may be leant, leased, borrowed, or sold at the authors will.

DETAILS

The algorithm intializes by generating 10 branch nodes, for 100
levels, per soldier, for an unlimited number of soldiers.

Soldier's contain SoldierStats and a BehaviorTree. They also have
the ability to run A* search to make a decision and an 
initial a* search to re-balance or initialize the tree.

The behavior tree consists of a root, branches, nodes, and leaves.

The nodes have sibling nodes and child nodes. They are also have
their own soldierStats that are used in comparison with the
soldier's soldier stats. There is also a fuzzy logic component
to keep the graph from going "stale". The node will return
a g(x) score when polled. The g(x) score is the cost of moving
down the branch to that node. 

A performance measure is performed, and the g(x) score is
modified by all of the soldier's stats as they relate to the
node's solldier stats. The lower the g(x) score the better.

Finally once the score g(x) is calculated, the fuzziness
factor is multiplied in and a final g(x) score to decide
on has been generated.

This process is conducted on all the children of the node
and the node with the leaset g(x) id chosen to be the next
node, that is, the next to traverse downwards.

Once the algorithm has traversed down to the bottom of a branch
(a leaf node) they will reach a behavior. There are 66 behaviors,
each unique. The chosen leaf's behavior is executed and a 
reward/punishment score results depending on the reward
or punishment the choice brought abnout.

Depending ont he reward/punishment, the back propagator 
will go backwards through the tree, taking the path that
the algorithm just toook, and adjust the node values 
eithe for better or worse.

Thenceforth, when the soldier is to make a decision, it
simply traverses his tree using a* and will arrive at
a decision.






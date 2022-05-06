Team Catious Crustaceans :: Orion Roven, Joshua Yagupsky, Johnathan Song
APCS pd0
HW93 -- exploring tree properties, extracting actionable intel from traversals
2022-05-05r
time spent:  0.2 hrs


DISCO
------------------------------------------------
* All perfect trees are complete and all complete trees are balanced.
================================================


QCC
------------------------------------------------
* What are balanced trees useful for?
* Is there a general method for combining two traversals into one tree? Are there some traversals where we cannot do this?
Does it depend on the number of nodes?
================================================


SELF-ASSESSMENT PROMPTS
------------------------------------------------
In which direction does a tree grow?

* Trees (the data type, at least) grow downward

Provide as many alternate definitions as you can for "tree," using graph terminology ("closed/open tours", "paths", "cycles", etc). Maximize clarity, succinctness.

* A tree is a graph where any two nodes are connected by exactly one non-backtracking path.
* A tree is a connected graph with no (non-trivial) cycles.

Why is a balanced tree allowed a difference of 1 in height between right and left subtrees?

* We essentially want our tree to be as close to a perfect binary tree as possible. That is, we don't want long linked lists of nodes. However,
perfect trees can only have certain numbers of nodes. Allowing a height difference of one between the subtrees gets us "as close as possible" to a balanced tree.

Alternate (equivalent, but more succinct?) definitions of "balanced" tree?

* If we define "wrangling" a tree to mean flipping one of its subtrees along the vertical axis passing through the root of the subtree, we can say that a
balanced tree is a binary tree which can be wrangled into a complete tree.

Is a perfect tree complete?

* Yes

Is a complete tree balanced?

* Yes

Is the Man Who Is Tall Happy?

* Perhaps? I hope so.

What must be true of perfect trees but not others?

* Its left and right side are the same and both are perfect trees of one degree lower.

* Wrangling any perfect tree gives you the same tree (although some of the nodes may have swapped places).

================================================


C'EST POSSIBLE?
------------------------------------------------
We found the solution! Here's what it looks like:

E: ,G
G: D,
D: K, I
I: N, L
L: O, W

Where A: B, C means that A has B below on the left and C below on the right.

================================================

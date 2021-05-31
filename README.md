# SCS2201 - Data Structures And Algorithms
UCSC 2nd year 1st semester data structures and algorithms

### TOPIC 1 - String Matching Algorithms
- [Naive String Matching](https://github.com/Gravewalker666/SCS2201-Data-Structures-and-Algorithms/blob/main/stringMatching/NaiveAlgorithm.java)
- [Rabin-Karp](https://github.com/Gravewalker666/SCS2201-Data-Structures-and-Algorithms/blob/main/stringMatching/RabinKarp.java)

| Algorithm | Preprocessing TIme | Matching Time |
| ---- | ----: | ----: |
| Naive | 0 | *O((n - m + 1)m)* |
| Rabin-Karp | *O(m)* | *O((n - m + 1)m)* |
| Finite Automation | *O(m* &#124;∑&#124;*)* | *O(n)* |
| Knuth-Morris-Pratt | *O(m)* | *O(n)* |

**n** - Length of the Text, **m**(< n) - Length of the Pattern

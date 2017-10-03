### 任意卡
Algorithms 课程分为2部分.
Part 1 主要讨论
1. datatypes
2. 排序
3. 搜索
Part 2 主要讨论
1. 图
2. 字符串
3. 基于之前算法的更多改进。
出处：Algorithms-course introduction


### 金句卡
> For me,great algorithms are the portry of computation.Just like verse,they can be terse,allusive,dense,and even mysterious.But once unlocked,they cast a brilliant new light on some aspect of computing.

出处：Francis Sullivan

### 金句卡
> Algorithms + Data Structures = Pragrams.

出处：Niklaus Wirth

### 技巧卡
科学探索的手段，从早期的用数学公式表达，到如今依靠计算机来模拟，其核心是寻找算法。
出处：Algorithms course introduction

### 术语卡
术语：dynamic connectivity
印象：给定一组对象，可以对它们做2中操作：1. 连接（uniton command）2. 查询两个对象是否连通。
例子：

* uniotn(4,3) :连接标号为4 和3 的对象
* connected(4,3):询问4，3对象是否相连。

出处：Algorithms-dynamic connectivity

### 术语卡
术语：connected components
印象：union find中连接程度最大的组件。
例子：
{0} {1 4 5} {2 3 6 7}中，有3个connected components，分别是这3个集合。

出处：Algorithms-dynamic connectivity

### 术语卡
术语：quick find
印象：union find 的一种。它是一种快速判断是否相连的方法，实现的手段是在数组中，将同一connected components的值改为同一id。因此，如果判断两个是否相连，只要看他们的值是否相同就可以了。但是它在添加新的连通时，效率不高，需要遍历整个数组。
例子：
`int [8] a = [0 1 1 8 8 0 0 1 8 8]`

* 查询： a[1] 与 a[2]因为值均为1，所以相连。
* 连通：a[0] 与a[1] ：因为a[1] =1，所以需要遍历整个数组，将值为1的全部改为值为0.

出处：Algorithms-quick find

### 任意卡
 quick find 的缺点：连通操作（union）的时间复杂度为n的平方。因为每一次出现新的连通，都要遍历一次数组
出处：Algorithms-quick find

### 术语卡
术语：quick union
印象：从它的名字就可以看出来，它的连通操作（union）很方便。就是把其中一项的根节点改为另一个连通组件(connected componet)的根节点，也就是说，只改变一个值。quick union的思路是让每个数组中的节点，存放它的父节点。因此当数组的下标与其值相同时，说明已经达到了根节点。
例子：
`int a [9] = [0 1 9 4 9 6 6 7 8 9]` 
将a[3] 与 a[5]连通：

1. a[3]=4 ==> a[4]=9  ==> a[9]==9
2. a[5] = 6 ==> a[6] ==6
3. a[9] = 6
出处：Algorithms-quick union

### 技巧卡
 quick union的缺陷：quick union的做法，实际上是将数组**同构**为树结构。因此思考quick union的缺陷，就可以从树结构的角度去理解--可能最后的树深度太大，遍历仍可能需要很长时间。
出处：Algorithms-quick union

### 术语卡
术语：weighted quick-union
印象：基于quick-union上的改进，增加了一个数组来记录每个「connected componet」中的长度，在每次相连的过程中，改变数组更小的connected component
例子： 除了原有的quick-union之外，额外添加一个数组记录根节点的大小，在添加的时候通过数组内容的大小判断：
`int j = root(p);
int j =root(q);
if (sz[i] < sz [j]) { id[i] = j;sz[j] += sz[i];}
else                  {id[j] = i; sz[i] += sz[j];}`

出处：Algorithms-Union find -- quick-union improvements

### 任意卡
 weithted quick-union 在find 和union操作的时间复杂度均为lg N。
 证明：抓住union过程的判断条件：a1 >= a2 ，换句话说，现有的connected component如果要增加1个深度，那么新来的大小必须大于它的。也就是说，它的深度增加1，数量起码增加N。因此如果一个connected component的大小为M，那么它的深度至多是lg M.所以，追溯到根节点的时间复杂度其实是lg 级别。
出处：Algorithms-Union find -- quick-union improvements

### 术语卡
术语：path compression
印象：与weighted quick-union类似，同样是对quick-union的一种改进。它在
例子：
`private int root(int)
{
    while (i !=id[i])
    {
        id[i] = id[id[i]];
        i = id[i];
    }
    return i;
}`

出处：Algorithms-Union find -- quick-union improvements

### 任意卡
 weighted quick-union 加上path compression，可以让这个复杂度降得非常低。
出处：Algorithms-Union find -- quick-union improvements

### 任意卡
20世纪 70年代，Knuth将科学方法引入对算法的分析中，这样就有了一个统一的方法，来理解程序的运行效率。
出处：Algorithms-analysis of algorithm-introductions

### 任意卡
Algorithm使用的度量算法复杂度的模型仍然是非常粗糙的，对于专家而言有着另一套度量标准。在他们的度量体系中，每一类计算都要纳入考虑标准，并且这套计算也考虑了不同的计算机硬件软件。
出处：analysis of algorithm-mathematical models 

### 术语卡
术语：cost model
印象：一个粗略的度量算法复杂度的方式，只考虑最关键的运算
例子：寻找数组中满足3个数相加等于0的所有可能。需要3个数组，最内层的数组是一个判断相加后是否相等。那么每执行一次最内层操作，算一次运算

出处：analysis of algorithm-mathematical models 

### 术语卡
术语：tidle notation
印象：度量算法复杂度的方法，丢掉lower-order项，只保留最高项。
例子：n平方+n ==> n平方

出处：analysis of algorithm-mathematical models 
  
  
  
  
  




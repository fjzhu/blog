# markdown 指南

首先回顾一下Markdown的[基本语法](https://www.jianshu.com/p/191d1e21f7ed)

## 本文主要针对Markdown在github上如何链接本地文件

- **链接jpg图片**[jpg图片](test/pig.jpg)
    > 此处采用relative path (test/pig.jpg)
    > 加！直接在当前页面显示图片，不加！进行图片的传送操作 (此处没加）
- **链接**[Markdown文件](test/README.md)
    > 此处与链接图片类似 （test/README.md)
- 链接[本地html文件](test/Assessment_timetable.html)
    >与链接文档相同
- 链接[PDF文件](https://github.com/fjzhu/blog/blob/master/Markdown/test/Tutorial%206%20Answers%20To%20Additional%20Tutorial%20Questions.pdf)
    >由于Markdown不支持PDF格式的传送，因此应链接到PDF所在的Github网页
- <a href= "#tag-jump">页面内跳转</a>
    >这是目录`<a href= "#tag-jump"></a>`
    <br>
    >这是跳转`<a id="tag-jump" href="#tag-jump"></a>`
    <br>
<a id="tag-jump" href="#tag-jump">看这里</a>

## *如有不懂点击右侧 Row 按钮查看源代码*

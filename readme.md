<<<<<<< HEAD
### SSM 和 Jquery和EasyUI练手

- 项目起始页：
	

![](https://github.com/WangJunT/ssm_easyui/blob/master/WebContent/resource/image/1.PNG)

![](https://github.com/WangJunT/ssm_easyui/blob/master/WebContent/resource/image/2.PNG)

左侧是一个树形菜单，点击标题则居中显示一个界面，图中显示的学生列表，只有一列数据显示了图片。
左上方的删除，修改，增加功能除了图片那一部分其余均已实现，以及下方的分页。

- 点击修改显示的界面：

	![](https://github.com/WangJunT/ssm_easyui/blob/master/WebContent/resource/image/5.PNG)

- 点击增加显示界面：

	![](https://github.com/WangJunT/ssm_easyui/blob/master/WebContent/resource/image/3.png)
	
- 本代码的问题：

1,  增加图片我是用的异步上传，先上传图片将图片存到服务器，然后获取图片路径，通过 ajax 获取图片路径，然后将图片路径和其它信息一起上传。现在关键就是获取到了图片路径，但是好像没有添加到表单中（主要是本人easyui不熟，不知道问题出在哪里）。

2, 使用 easyui 时，用 table 显示获取到的数据，有一个是图片，当我点击修改的时候，希望在图片那一栏将图片显示出来，但是没有做到。

=======
#### SSM 和 Jquery和EasyUI练手

1. 项目起始页：
	

![](https://github.com/WangJunT/ssm_easyui/blob/master/WebContent/resource/image/1.PNG)
>>>>>>> 5b4fc92f72595bc3c79ae401e910ec1c5a5cf20f

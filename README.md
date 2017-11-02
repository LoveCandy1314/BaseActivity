# BaseActivity

模式的定义:

    定义一个操作中的算法的框架，而将一些步骤延迟到子类中。使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。

模式的使用场景

  1.多个子类有公有的方法，并且逻辑基本相同时。
  2.重要、复杂的算法，可以把核心算法设计为模板方法，周边的相关细节功能则由各个子类实现。
  3.重构时，模板方法模式是一个经常使用的模式，把相同的代码抽取到父类中，然后通过钩子函数约束其行为。
  
  
  此工程层次为   app-->framelibrary-->baselibrary
  
  其中framelibrary作为中间层,是为了方便后期实现换肤功能.这里方便扩展使用.
  baselibrary为最底层库,上层activity公有的方法封装在这一层.每个上层继承BaseSkinActivity的activity 都会执行这一套流程,具体执行方法由子类完成
        
        
        
        // 设置布局layout
        setContentView();

        // 初始化头部
        initTitle();

        // 初始化界面
        initView();

        // 初始化数据
        initData();

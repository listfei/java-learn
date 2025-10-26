package com.listfei.keywords;

public class KeyWords {

    public static void main(String[] args) {
        // 输出java中所有关键字及其作用

        System.out.println("=== 访问控制修饰符 ===");
        System.out.println("public: 公共访问权限，对所有类可见");
        System.out.println("protected: 受保护的访问权限，在同一包内或子类中可见");
        System.out.println("private: 私有访问权限，仅在定义该成员的类内部可见");

        System.out.println("\n=== 类、方法和变量修饰符 ===");
        System.out.println("abstract: 抽象类或抽象方法，没有具体实现");
        System.out.println("final: 最终的，不可修改");
        System.out.println("static: 静态的，属于类而非实例");
        System.out.println("synchronized: 同步的，用于多线程环境下的同步控制");
        System.out.println("transient: 瞬态的，序列化时忽略该字段");
        System.out.println("volatile: 易变的，保证多线程环境下变量的可见性");

        System.out.println("\n=== 程序控制语句 ===");
        System.out.println("if: 条件判断语句");
        System.out.println("else: 条件分支语句");
        System.out.println("switch: 多分支选择语句");
        System.out.println("case: switch语句中的分支选项");
        System.out.println("default: switch语句中的默认分支");
        System.out.println("for: 循环语句");
        System.out.println("while: 循环语句");
        System.out.println("do: do-while循环语句的一部分");
        System.out.println("break: 跳出循环或switch语句");
        System.out.println("continue: 跳过本次循环继续下一次循环");
        System.out.println("return: 从方法中返回结果");

        System.out.println("\n=== 错误处理 ===");
        System.out.println("try: 捕获异常的代码块");
        System.out.println("catch: 处理特定异常的代码块");
        System.out.println("finally: 无论是否发生异常都会执行的代码块");
        System.out.println("throw: 抛出一个异常");
        System.out.println("throws: 声明方法可能抛出的异常类型");

        System.out.println("\n=== 包相关 ===");
        System.out.println("import: 导入其他包中的类或接口");
        System.out.println("package: 定义当前类所属的包");

        System.out.println("\n=== 基本数据类型 ===");
        System.out.println("boolean: 布尔类型");
        System.out.println("byte: 字节类型（8位）");
        System.out.println("char: 字符类型（16位Unicode字符）");
        System.out.println("short: 短整型（16位）");
        System.out.println("int: 整型（32位）");
        System.out.println("long: 长整型（64位）");
        System.out.println("float: 单精度浮点型（32位）");
        System.out.println("double: 双精度浮点型（64位）");

        System.out.println("\n=== 变量引用 ===");
        System.out.println("this: 指向当前对象实例的引用");
        System.out.println("super: 指向父类对象的引用");
        System.out.println("new: 创建新对象实例");
        System.out.println("instanceof: 判断对象是否为某个类的实例");

        System.out.println("\n=== 流程控制（保留关键字）===");
        System.out.println("goto: 保留关键字，未被使用");
        System.out.println("const: 保留关键字，未被使用");

        System.out.println("\n=== 其他关键字 ===");
        System.out.println("class: 定义类");
        System.out.println("interface: 定义接口");
        System.out.println("enum: 定义枚举类型");
        System.out.println("extends: 表示继承关系");
        System.out.println("implements: 表示实现接口");
        System.out.println("null: 表示空引用");
        System.out.println("true: 布尔值真");
        System.out.println("false: 布尔值假");
        System.out.println("void: 表示无返回值");
        System.out.println("assert: 断言，用于调试");
    }
}

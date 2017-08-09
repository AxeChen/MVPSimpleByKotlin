package com.mg.axe.kotlinmvp.module

/**
 * @Author Zaifeng
 * @Create 2017/8/9 0009
 * @Description Content
 */
 class UserBean{
    
    constructor(name: String?, description: String?) {
        this.name = name
        this.description = description
    }

    var name:String? = null
    var description:String? = null
}
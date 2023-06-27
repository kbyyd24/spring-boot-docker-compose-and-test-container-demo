package cn.gaoyuexiang.demo

import cn.gaoyuexiang.demo.config.ContainersConfig
import org.springframework.boot.SpringApplication

fun main(args: Array<String>) {
  SpringApplication
    .from(TodoApplication.Companion::main)
    .with(ContainersConfig::class.java)
    .run(*args)
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.craftinginterpreters.lox;

/**
 *
 * @author sharon
 */
import java.util.List;

interface LoxCallable {
    int arity();
  Object call(Interpreter interpreter, List<Object> arguments);
}

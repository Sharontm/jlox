/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.craftinginterpreters.lox;

/**
 *
 * @author sharon
 */
class Token 
{
  final TokenType type;
  final String lexeme;
  final Object literal;
  final int line; 
  
  Token(TokenType type, String lexeme, Object literal, int line) 
  {
    this.type = type;
    this.lexeme = lexeme;
    this.literal = literal;
    this.line = line;
  }

  public String toString() 
  {
    return type + " " + lexeme + " " + literal;
  }
}

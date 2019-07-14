package com.henry.ctd.data

enum Either[A, B] {
  case Left(a: A)
  case Right(b: B)
}

import Either._

def asLeft[A](a: A): Either[A, ?] = Left(a)

def asRight[B](b: B): Either[?, B] = Right(b)

def coproductFactorizer[A, B, C](i: A => C)(j: B => C)(either: Either[A, B]): C = either match {
  case Left(a) => i(a)
  case Right(b) => j(b)
}
package com.henry.ctd.data.pair

case class Pair[A, B](a: A, b: B)

def fst[A](pair: Pair[A, ?]): A = pair match {
  case Pair(a, _) => a
}

def snd[B](pair: Pair[?, B]): B = pair match {
  case Pair(_, b) => b
}
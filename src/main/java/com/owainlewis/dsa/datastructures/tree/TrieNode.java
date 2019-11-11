package com.owainlewis.dsa.datastructures.tree;

import java.util.HashMap;

public final class TrieNode {

  private HashMap<Character, TrieNode> children;

  private String content;

  private boolean isWord;
}

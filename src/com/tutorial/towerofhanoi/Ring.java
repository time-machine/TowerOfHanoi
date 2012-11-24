package com.tutorial.towerofhanoi;

import java.util.Stack;

import org.andengine.entity.sprite.Sprite;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

public class Ring extends Sprite {
  private final int mWeight;
  private Stack mStack; // this represents the stack that this ring belongs to
  private Sprite mTower;

  public Ring(int weight, float pX, float pY, ITextureRegion pTextureRegion,
    VertexBufferObjectManager pVerTexBufferObjectManager) {
    super(pX, pY, pTextureRegion, pVerTexBufferObjectManager);
    this.mWeight = weight;
  }

  public int getmWeight() {
    return mWeight;
  }

  public Stack getmStack() {
    return mStack;
  }

  public void setmStack(Stack mStack) {
    this.mStack = mStack;
  }

  public Sprite getmTower() {
    return mTower;
  }

  public void setmTower(Sprite mTower) {
    this.mTower = mTower;
  }
}

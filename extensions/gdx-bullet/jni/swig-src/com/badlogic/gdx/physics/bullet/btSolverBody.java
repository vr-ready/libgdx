/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btSolverBody {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btSolverBody(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btSolverBody obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btSolverBody(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_worldTransform(btTransform value) {
    gdxBulletJNI.btSolverBody_m_worldTransform_set(swigCPtr, this, btTransform.getCPtr(value), value);
  }

  public btTransform getM_worldTransform() {
    long cPtr = gdxBulletJNI.btSolverBody_m_worldTransform_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransform(cPtr, false);
  }

  public void setM_deltaLinearVelocity(btVector3 value) {
    gdxBulletJNI.btSolverBody_m_deltaLinearVelocity_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_deltaLinearVelocity() {
    long cPtr = gdxBulletJNI.btSolverBody_m_deltaLinearVelocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_deltaAngularVelocity(btVector3 value) {
    gdxBulletJNI.btSolverBody_m_deltaAngularVelocity_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_deltaAngularVelocity() {
    long cPtr = gdxBulletJNI.btSolverBody_m_deltaAngularVelocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_angularFactor(btVector3 value) {
    gdxBulletJNI.btSolverBody_m_angularFactor_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_angularFactor() {
    long cPtr = gdxBulletJNI.btSolverBody_m_angularFactor_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_linearFactor(btVector3 value) {
    gdxBulletJNI.btSolverBody_m_linearFactor_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_linearFactor() {
    long cPtr = gdxBulletJNI.btSolverBody_m_linearFactor_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_invMass(btVector3 value) {
    gdxBulletJNI.btSolverBody_m_invMass_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_invMass() {
    long cPtr = gdxBulletJNI.btSolverBody_m_invMass_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_pushVelocity(btVector3 value) {
    gdxBulletJNI.btSolverBody_m_pushVelocity_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_pushVelocity() {
    long cPtr = gdxBulletJNI.btSolverBody_m_pushVelocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_turnVelocity(btVector3 value) {
    gdxBulletJNI.btSolverBody_m_turnVelocity_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_turnVelocity() {
    long cPtr = gdxBulletJNI.btSolverBody_m_turnVelocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_linearVelocity(btVector3 value) {
    gdxBulletJNI.btSolverBody_m_linearVelocity_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_linearVelocity() {
    long cPtr = gdxBulletJNI.btSolverBody_m_linearVelocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_angularVelocity(btVector3 value) {
    gdxBulletJNI.btSolverBody_m_angularVelocity_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_angularVelocity() {
    long cPtr = gdxBulletJNI.btSolverBody_m_angularVelocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_originalBody(btRigidBody value) {
    gdxBulletJNI.btSolverBody_m_originalBody_set(swigCPtr, this, btRigidBody.getCPtr(value), value);
  }

  public btRigidBody getM_originalBody() {
    long cPtr = gdxBulletJNI.btSolverBody_m_originalBody_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btRigidBody(cPtr, false);
  }

  public void setWorldTransform(Matrix4 worldTransform) {
    gdxBulletJNI.btSolverBody_setWorldTransform(swigCPtr, this, worldTransform);
  }

  public Matrix4 getWorldTransform() {
	return gdxBulletJNI.btSolverBody_getWorldTransform(swigCPtr, this);
}

  public void getVelocityInLocalPointObsolete(Vector3 rel_pos, Vector3 velocity) {
    gdxBulletJNI.btSolverBody_getVelocityInLocalPointObsolete(swigCPtr, this, rel_pos, velocity);
  }

  public void getAngularVelocity(Vector3 angVel) {
    gdxBulletJNI.btSolverBody_getAngularVelocity(swigCPtr, this, angVel);
  }

  public void applyImpulse(Vector3 linearComponent, Vector3 angularComponent, float impulseMagnitude) {
    gdxBulletJNI.btSolverBody_applyImpulse(swigCPtr, this, linearComponent, angularComponent, impulseMagnitude);
  }

  public void internalApplyPushImpulse(Vector3 linearComponent, Vector3 angularComponent, float impulseMagnitude) {
    gdxBulletJNI.btSolverBody_internalApplyPushImpulse(swigCPtr, this, linearComponent, angularComponent, impulseMagnitude);
  }

  public Vector3 getDeltaLinearVelocity() {
	return gdxBulletJNI.btSolverBody_getDeltaLinearVelocity(swigCPtr, this);
}

  public Vector3 getDeltaAngularVelocity() {
	return gdxBulletJNI.btSolverBody_getDeltaAngularVelocity(swigCPtr, this);
}

  public Vector3 getPushVelocity() {
	return gdxBulletJNI.btSolverBody_getPushVelocity(swigCPtr, this);
}

  public Vector3 getTurnVelocity() {
	return gdxBulletJNI.btSolverBody_getTurnVelocity(swigCPtr, this);
}

  public Vector3 internalGetDeltaLinearVelocity() {
	return gdxBulletJNI.btSolverBody_internalGetDeltaLinearVelocity(swigCPtr, this);
}

  public Vector3 internalGetDeltaAngularVelocity() {
	return gdxBulletJNI.btSolverBody_internalGetDeltaAngularVelocity(swigCPtr, this);
}

  public Vector3 internalGetAngularFactor() {
	return gdxBulletJNI.btSolverBody_internalGetAngularFactor(swigCPtr, this);
}

  public Vector3 internalGetInvMass() {
	return gdxBulletJNI.btSolverBody_internalGetInvMass(swigCPtr, this);
}

  public void internalSetInvMass(Vector3 invMass) {
    gdxBulletJNI.btSolverBody_internalSetInvMass(swigCPtr, this, invMass);
  }

  public Vector3 internalGetPushVelocity() {
	return gdxBulletJNI.btSolverBody_internalGetPushVelocity(swigCPtr, this);
}

  public Vector3 internalGetTurnVelocity() {
	return gdxBulletJNI.btSolverBody_internalGetTurnVelocity(swigCPtr, this);
}

  public void internalGetVelocityInLocalPointObsolete(Vector3 rel_pos, Vector3 velocity) {
    gdxBulletJNI.btSolverBody_internalGetVelocityInLocalPointObsolete(swigCPtr, this, rel_pos, velocity);
  }

  public void internalGetAngularVelocity(Vector3 angVel) {
    gdxBulletJNI.btSolverBody_internalGetAngularVelocity(swigCPtr, this, angVel);
  }

  public void internalApplyImpulse(Vector3 linearComponent, Vector3 angularComponent, float impulseMagnitude) {
    gdxBulletJNI.btSolverBody_internalApplyImpulse(swigCPtr, this, linearComponent, angularComponent, impulseMagnitude);
  }

  public void writebackVelocity() {
    gdxBulletJNI.btSolverBody_writebackVelocity(swigCPtr, this);
  }

  public void writebackVelocityAndTransform(float timeStep, float splitImpulseTurnErp) {
    gdxBulletJNI.btSolverBody_writebackVelocityAndTransform(swigCPtr, this, timeStep, splitImpulseTurnErp);
  }

  public btSolverBody() {
    this(gdxBulletJNI.new_btSolverBody(), true);
  }

}

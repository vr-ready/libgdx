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

public class btTriangleMeshShape extends btConcaveShape {
  private long swigCPtr;

  protected btTriangleMeshShape(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.btTriangleMeshShape_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(btTriangleMeshShape obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btTriangleMeshShape(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Vector3 localGetSupportingVertex(Vector3 vec) {
	return gdxBulletJNI.btTriangleMeshShape_localGetSupportingVertex(swigCPtr, this, vec);
}

  public Vector3 localGetSupportingVertexWithoutMargin(Vector3 vec) {
	return gdxBulletJNI.btTriangleMeshShape_localGetSupportingVertexWithoutMargin(swigCPtr, this, vec);
}

  public void recalcLocalAabb() {
    gdxBulletJNI.btTriangleMeshShape_recalcLocalAabb(swigCPtr, this);
  }

  public btStridingMeshInterface getMeshInterface() {
    long cPtr = gdxBulletJNI.btTriangleMeshShape_getMeshInterface__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new btStridingMeshInterface(cPtr, false);
  }

  public Vector3 getLocalAabbMin() {
	return gdxBulletJNI.btTriangleMeshShape_getLocalAabbMin(swigCPtr, this);
}

  public Vector3 getLocalAabbMax() {
	return gdxBulletJNI.btTriangleMeshShape_getLocalAabbMax(swigCPtr, this);
}

}

/**
 * generated by Xtext 2.21.0
 */
package org.virtio.virtiodriver.ftracelanguage.frtraceLanguage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.virtio.virtiodriver.ftracelanguage.frtraceLanguage.FrtraceLanguagePackage;
import org.virtio.virtiodriver.ftracelanguage.frtraceLanguage.Trace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.virtio.virtiodriver.ftracelanguage.frtraceLanguage.impl.TraceImpl#getFirst <em>First</em>}</li>
 *   <li>{@link org.virtio.virtiodriver.ftracelanguage.frtraceLanguage.impl.TraceImpl#getSecond <em>Second</em>}</li>
 *   <li>{@link org.virtio.virtiodriver.ftracelanguage.frtraceLanguage.impl.TraceImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.virtio.virtiodriver.ftracelanguage.frtraceLanguage.impl.TraceImpl#getDec <em>Dec</em>}</li>
 *   <li>{@link org.virtio.virtiodriver.ftracelanguage.frtraceLanguage.impl.TraceImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.virtio.virtiodriver.ftracelanguage.frtraceLanguage.impl.TraceImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraceImpl extends MinimalEObjectImpl.Container implements Trace
{
  /**
   * The default value of the '{@link #getFirst() <em>First</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirst()
   * @generated
   * @ordered
   */
  protected static final String FIRST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFirst() <em>First</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirst()
   * @generated
   * @ordered
   */
  protected String first = FIRST_EDEFAULT;

  /**
   * The default value of the '{@link #getSecond() <em>Second</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecond()
   * @generated
   * @ordered
   */
  protected static final int SECOND_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSecond() <em>Second</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecond()
   * @generated
   * @ordered
   */
  protected int second = SECOND_EDEFAULT;

  /**
   * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimestamp()
   * @generated
   * @ordered
   */
  protected static final int TIMESTAMP_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimestamp()
   * @generated
   * @ordered
   */
  protected int timestamp = TIMESTAMP_EDEFAULT;

  /**
   * The default value of the '{@link #getDec() <em>Dec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDec()
   * @generated
   * @ordered
   */
  protected static final int DEC_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDec() <em>Dec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDec()
   * @generated
   * @ordered
   */
  protected int dec = DEC_EDEFAULT;

  /**
   * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected static final String FUNCTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected String function = FUNCTION_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TraceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FrtraceLanguagePackage.Literals.TRACE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFirst()
  {
    return first;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFirst(String newFirst)
  {
    String oldFirst = first;
    first = newFirst;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FrtraceLanguagePackage.TRACE__FIRST, oldFirst, first));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getSecond()
  {
    return second;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSecond(int newSecond)
  {
    int oldSecond = second;
    second = newSecond;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FrtraceLanguagePackage.TRACE__SECOND, oldSecond, second));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getTimestamp()
  {
    return timestamp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTimestamp(int newTimestamp)
  {
    int oldTimestamp = timestamp;
    timestamp = newTimestamp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FrtraceLanguagePackage.TRACE__TIMESTAMP, oldTimestamp, timestamp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getDec()
  {
    return dec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDec(int newDec)
  {
    int oldDec = dec;
    dec = newDec;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FrtraceLanguagePackage.TRACE__DEC, oldDec, dec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFunction()
  {
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFunction(String newFunction)
  {
    String oldFunction = function;
    function = newFunction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FrtraceLanguagePackage.TRACE__FUNCTION, oldFunction, function));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FrtraceLanguagePackage.TRACE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FrtraceLanguagePackage.TRACE__FIRST:
        return getFirst();
      case FrtraceLanguagePackage.TRACE__SECOND:
        return getSecond();
      case FrtraceLanguagePackage.TRACE__TIMESTAMP:
        return getTimestamp();
      case FrtraceLanguagePackage.TRACE__DEC:
        return getDec();
      case FrtraceLanguagePackage.TRACE__FUNCTION:
        return getFunction();
      case FrtraceLanguagePackage.TRACE__NAME:
        return getName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FrtraceLanguagePackage.TRACE__FIRST:
        setFirst((String)newValue);
        return;
      case FrtraceLanguagePackage.TRACE__SECOND:
        setSecond((Integer)newValue);
        return;
      case FrtraceLanguagePackage.TRACE__TIMESTAMP:
        setTimestamp((Integer)newValue);
        return;
      case FrtraceLanguagePackage.TRACE__DEC:
        setDec((Integer)newValue);
        return;
      case FrtraceLanguagePackage.TRACE__FUNCTION:
        setFunction((String)newValue);
        return;
      case FrtraceLanguagePackage.TRACE__NAME:
        setName((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FrtraceLanguagePackage.TRACE__FIRST:
        setFirst(FIRST_EDEFAULT);
        return;
      case FrtraceLanguagePackage.TRACE__SECOND:
        setSecond(SECOND_EDEFAULT);
        return;
      case FrtraceLanguagePackage.TRACE__TIMESTAMP:
        setTimestamp(TIMESTAMP_EDEFAULT);
        return;
      case FrtraceLanguagePackage.TRACE__DEC:
        setDec(DEC_EDEFAULT);
        return;
      case FrtraceLanguagePackage.TRACE__FUNCTION:
        setFunction(FUNCTION_EDEFAULT);
        return;
      case FrtraceLanguagePackage.TRACE__NAME:
        setName(NAME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FrtraceLanguagePackage.TRACE__FIRST:
        return FIRST_EDEFAULT == null ? first != null : !FIRST_EDEFAULT.equals(first);
      case FrtraceLanguagePackage.TRACE__SECOND:
        return second != SECOND_EDEFAULT;
      case FrtraceLanguagePackage.TRACE__TIMESTAMP:
        return timestamp != TIMESTAMP_EDEFAULT;
      case FrtraceLanguagePackage.TRACE__DEC:
        return dec != DEC_EDEFAULT;
      case FrtraceLanguagePackage.TRACE__FUNCTION:
        return FUNCTION_EDEFAULT == null ? function != null : !FUNCTION_EDEFAULT.equals(function);
      case FrtraceLanguagePackage.TRACE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (first: ");
    result.append(first);
    result.append(", second: ");
    result.append(second);
    result.append(", timestamp: ");
    result.append(timestamp);
    result.append(", dec: ");
    result.append(dec);
    result.append(", function: ");
    result.append(function);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //TraceImpl

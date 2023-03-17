/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.training.people.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.training.people.exception.NoSuchLoansException;
import com.liferay.training.people.model.Loans;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the loans service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LoansUtil
 * @generated
 */
@ProviderType
public interface LoansPersistence extends BasePersistence<Loans> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LoansUtil} to access the loans persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the loanses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching loanses
	 */
	public java.util.List<Loans> findByUuid(String uuid);

	/**
	 * Returns a range of all the loanses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LoansModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of loanses
	 * @param end the upper bound of the range of loanses (not inclusive)
	 * @return the range of matching loanses
	 */
	public java.util.List<Loans> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the loanses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LoansModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of loanses
	 * @param end the upper bound of the range of loanses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching loanses
	 */
	public java.util.List<Loans> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Loans>
			orderByComparator);

	/**
	 * Returns an ordered range of all the loanses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LoansModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of loanses
	 * @param end the upper bound of the range of loanses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching loanses
	 */
	public java.util.List<Loans> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Loans>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first loans in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching loans
	 * @throws NoSuchLoansException if a matching loans could not be found
	 */
	public Loans findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Loans>
				orderByComparator)
		throws NoSuchLoansException;

	/**
	 * Returns the first loans in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching loans, or <code>null</code> if a matching loans could not be found
	 */
	public Loans fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Loans>
			orderByComparator);

	/**
	 * Returns the last loans in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching loans
	 * @throws NoSuchLoansException if a matching loans could not be found
	 */
	public Loans findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Loans>
				orderByComparator)
		throws NoSuchLoansException;

	/**
	 * Returns the last loans in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching loans, or <code>null</code> if a matching loans could not be found
	 */
	public Loans fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Loans>
			orderByComparator);

	/**
	 * Returns the loanses before and after the current loans in the ordered set where uuid = &#63;.
	 *
	 * @param peopleId the primary key of the current loans
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next loans
	 * @throws NoSuchLoansException if a loans with the primary key could not be found
	 */
	public Loans[] findByUuid_PrevAndNext(
			long peopleId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Loans>
				orderByComparator)
		throws NoSuchLoansException;

	/**
	 * Removes all the loanses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of loanses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching loanses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the loans where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchLoansException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching loans
	 * @throws NoSuchLoansException if a matching loans could not be found
	 */
	public Loans findByUUID_G(String uuid, long groupId)
		throws NoSuchLoansException;

	/**
	 * Returns the loans where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching loans, or <code>null</code> if a matching loans could not be found
	 */
	public Loans fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the loans where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching loans, or <code>null</code> if a matching loans could not be found
	 */
	public Loans fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the loans where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the loans that was removed
	 */
	public Loans removeByUUID_G(String uuid, long groupId)
		throws NoSuchLoansException;

	/**
	 * Returns the number of loanses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching loanses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the loanses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching loanses
	 */
	public java.util.List<Loans> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the loanses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LoansModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of loanses
	 * @param end the upper bound of the range of loanses (not inclusive)
	 * @return the range of matching loanses
	 */
	public java.util.List<Loans> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the loanses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LoansModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of loanses
	 * @param end the upper bound of the range of loanses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching loanses
	 */
	public java.util.List<Loans> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Loans>
			orderByComparator);

	/**
	 * Returns an ordered range of all the loanses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LoansModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of loanses
	 * @param end the upper bound of the range of loanses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching loanses
	 */
	public java.util.List<Loans> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Loans>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first loans in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching loans
	 * @throws NoSuchLoansException if a matching loans could not be found
	 */
	public Loans findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Loans>
				orderByComparator)
		throws NoSuchLoansException;

	/**
	 * Returns the first loans in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching loans, or <code>null</code> if a matching loans could not be found
	 */
	public Loans fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Loans>
			orderByComparator);

	/**
	 * Returns the last loans in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching loans
	 * @throws NoSuchLoansException if a matching loans could not be found
	 */
	public Loans findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Loans>
				orderByComparator)
		throws NoSuchLoansException;

	/**
	 * Returns the last loans in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching loans, or <code>null</code> if a matching loans could not be found
	 */
	public Loans fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Loans>
			orderByComparator);

	/**
	 * Returns the loanses before and after the current loans in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param peopleId the primary key of the current loans
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next loans
	 * @throws NoSuchLoansException if a loans with the primary key could not be found
	 */
	public Loans[] findByUuid_C_PrevAndNext(
			long peopleId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Loans>
				orderByComparator)
		throws NoSuchLoansException;

	/**
	 * Removes all the loanses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of loanses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching loanses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the loanses where surname = &#63;.
	 *
	 * @param surname the surname
	 * @return the matching loanses
	 */
	public java.util.List<Loans> findBysurname(String surname);

	/**
	 * Returns a range of all the loanses where surname = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LoansModelImpl</code>.
	 * </p>
	 *
	 * @param surname the surname
	 * @param start the lower bound of the range of loanses
	 * @param end the upper bound of the range of loanses (not inclusive)
	 * @return the range of matching loanses
	 */
	public java.util.List<Loans> findBysurname(
		String surname, int start, int end);

	/**
	 * Returns an ordered range of all the loanses where surname = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LoansModelImpl</code>.
	 * </p>
	 *
	 * @param surname the surname
	 * @param start the lower bound of the range of loanses
	 * @param end the upper bound of the range of loanses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching loanses
	 */
	public java.util.List<Loans> findBysurname(
		String surname, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Loans>
			orderByComparator);

	/**
	 * Returns an ordered range of all the loanses where surname = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LoansModelImpl</code>.
	 * </p>
	 *
	 * @param surname the surname
	 * @param start the lower bound of the range of loanses
	 * @param end the upper bound of the range of loanses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching loanses
	 */
	public java.util.List<Loans> findBysurname(
		String surname, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Loans>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first loans in the ordered set where surname = &#63;.
	 *
	 * @param surname the surname
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching loans
	 * @throws NoSuchLoansException if a matching loans could not be found
	 */
	public Loans findBysurname_First(
			String surname,
			com.liferay.portal.kernel.util.OrderByComparator<Loans>
				orderByComparator)
		throws NoSuchLoansException;

	/**
	 * Returns the first loans in the ordered set where surname = &#63;.
	 *
	 * @param surname the surname
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching loans, or <code>null</code> if a matching loans could not be found
	 */
	public Loans fetchBysurname_First(
		String surname,
		com.liferay.portal.kernel.util.OrderByComparator<Loans>
			orderByComparator);

	/**
	 * Returns the last loans in the ordered set where surname = &#63;.
	 *
	 * @param surname the surname
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching loans
	 * @throws NoSuchLoansException if a matching loans could not be found
	 */
	public Loans findBysurname_Last(
			String surname,
			com.liferay.portal.kernel.util.OrderByComparator<Loans>
				orderByComparator)
		throws NoSuchLoansException;

	/**
	 * Returns the last loans in the ordered set where surname = &#63;.
	 *
	 * @param surname the surname
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching loans, or <code>null</code> if a matching loans could not be found
	 */
	public Loans fetchBysurname_Last(
		String surname,
		com.liferay.portal.kernel.util.OrderByComparator<Loans>
			orderByComparator);

	/**
	 * Returns the loanses before and after the current loans in the ordered set where surname = &#63;.
	 *
	 * @param peopleId the primary key of the current loans
	 * @param surname the surname
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next loans
	 * @throws NoSuchLoansException if a loans with the primary key could not be found
	 */
	public Loans[] findBysurname_PrevAndNext(
			long peopleId, String surname,
			com.liferay.portal.kernel.util.OrderByComparator<Loans>
				orderByComparator)
		throws NoSuchLoansException;

	/**
	 * Removes all the loanses where surname = &#63; from the database.
	 *
	 * @param surname the surname
	 */
	public void removeBysurname(String surname);

	/**
	 * Returns the number of loanses where surname = &#63;.
	 *
	 * @param surname the surname
	 * @return the number of matching loanses
	 */
	public int countBysurname(String surname);

	/**
	 * Caches the loans in the entity cache if it is enabled.
	 *
	 * @param loans the loans
	 */
	public void cacheResult(Loans loans);

	/**
	 * Caches the loanses in the entity cache if it is enabled.
	 *
	 * @param loanses the loanses
	 */
	public void cacheResult(java.util.List<Loans> loanses);

	/**
	 * Creates a new loans with the primary key. Does not add the loans to the database.
	 *
	 * @param peopleId the primary key for the new loans
	 * @return the new loans
	 */
	public Loans create(long peopleId);

	/**
	 * Removes the loans with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param peopleId the primary key of the loans
	 * @return the loans that was removed
	 * @throws NoSuchLoansException if a loans with the primary key could not be found
	 */
	public Loans remove(long peopleId) throws NoSuchLoansException;

	public Loans updateImpl(Loans loans);

	/**
	 * Returns the loans with the primary key or throws a <code>NoSuchLoansException</code> if it could not be found.
	 *
	 * @param peopleId the primary key of the loans
	 * @return the loans
	 * @throws NoSuchLoansException if a loans with the primary key could not be found
	 */
	public Loans findByPrimaryKey(long peopleId) throws NoSuchLoansException;

	/**
	 * Returns the loans with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param peopleId the primary key of the loans
	 * @return the loans, or <code>null</code> if a loans with the primary key could not be found
	 */
	public Loans fetchByPrimaryKey(long peopleId);

	/**
	 * Returns all the loanses.
	 *
	 * @return the loanses
	 */
	public java.util.List<Loans> findAll();

	/**
	 * Returns a range of all the loanses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LoansModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of loanses
	 * @param end the upper bound of the range of loanses (not inclusive)
	 * @return the range of loanses
	 */
	public java.util.List<Loans> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the loanses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LoansModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of loanses
	 * @param end the upper bound of the range of loanses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of loanses
	 */
	public java.util.List<Loans> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Loans>
			orderByComparator);

	/**
	 * Returns an ordered range of all the loanses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LoansModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of loanses
	 * @param end the upper bound of the range of loanses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of loanses
	 */
	public java.util.List<Loans> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Loans>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the loanses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of loanses.
	 *
	 * @return the number of loanses
	 */
	public int countAll();

}
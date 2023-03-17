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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.training.people.model.Loans;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the loans service. This utility wraps <code>com.liferay.training.people.service.persistence.impl.LoansPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LoansPersistence
 * @generated
 */
public class LoansUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Loans loans) {
		getPersistence().clearCache(loans);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Loans> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Loans> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Loans> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Loans> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Loans> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Loans update(Loans loans) {
		return getPersistence().update(loans);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Loans update(Loans loans, ServiceContext serviceContext) {
		return getPersistence().update(loans, serviceContext);
	}

	/**
	 * Returns all the loanses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching loanses
	 */
	public static List<Loans> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<Loans> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<Loans> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Loans> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<Loans> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Loans> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first loans in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching loans
	 * @throws NoSuchLoansException if a matching loans could not be found
	 */
	public static Loans findByUuid_First(
			String uuid, OrderByComparator<Loans> orderByComparator)
		throws com.liferay.training.people.exception.NoSuchLoansException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first loans in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching loans, or <code>null</code> if a matching loans could not be found
	 */
	public static Loans fetchByUuid_First(
		String uuid, OrderByComparator<Loans> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last loans in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching loans
	 * @throws NoSuchLoansException if a matching loans could not be found
	 */
	public static Loans findByUuid_Last(
			String uuid, OrderByComparator<Loans> orderByComparator)
		throws com.liferay.training.people.exception.NoSuchLoansException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last loans in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching loans, or <code>null</code> if a matching loans could not be found
	 */
	public static Loans fetchByUuid_Last(
		String uuid, OrderByComparator<Loans> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the loanses before and after the current loans in the ordered set where uuid = &#63;.
	 *
	 * @param peopleId the primary key of the current loans
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next loans
	 * @throws NoSuchLoansException if a loans with the primary key could not be found
	 */
	public static Loans[] findByUuid_PrevAndNext(
			long peopleId, String uuid,
			OrderByComparator<Loans> orderByComparator)
		throws com.liferay.training.people.exception.NoSuchLoansException {

		return getPersistence().findByUuid_PrevAndNext(
			peopleId, uuid, orderByComparator);
	}

	/**
	 * Removes all the loanses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of loanses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching loanses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the loans where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchLoansException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching loans
	 * @throws NoSuchLoansException if a matching loans could not be found
	 */
	public static Loans findByUUID_G(String uuid, long groupId)
		throws com.liferay.training.people.exception.NoSuchLoansException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the loans where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching loans, or <code>null</code> if a matching loans could not be found
	 */
	public static Loans fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the loans where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching loans, or <code>null</code> if a matching loans could not be found
	 */
	public static Loans fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the loans where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the loans that was removed
	 */
	public static Loans removeByUUID_G(String uuid, long groupId)
		throws com.liferay.training.people.exception.NoSuchLoansException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of loanses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching loanses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the loanses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching loanses
	 */
	public static List<Loans> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<Loans> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<Loans> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Loans> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<Loans> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Loans> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first loans in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching loans
	 * @throws NoSuchLoansException if a matching loans could not be found
	 */
	public static Loans findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Loans> orderByComparator)
		throws com.liferay.training.people.exception.NoSuchLoansException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first loans in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching loans, or <code>null</code> if a matching loans could not be found
	 */
	public static Loans fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Loans> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last loans in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching loans
	 * @throws NoSuchLoansException if a matching loans could not be found
	 */
	public static Loans findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Loans> orderByComparator)
		throws com.liferay.training.people.exception.NoSuchLoansException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last loans in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching loans, or <code>null</code> if a matching loans could not be found
	 */
	public static Loans fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Loans> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

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
	public static Loans[] findByUuid_C_PrevAndNext(
			long peopleId, String uuid, long companyId,
			OrderByComparator<Loans> orderByComparator)
		throws com.liferay.training.people.exception.NoSuchLoansException {

		return getPersistence().findByUuid_C_PrevAndNext(
			peopleId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the loanses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of loanses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching loanses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the loanses where surname = &#63;.
	 *
	 * @param surname the surname
	 * @return the matching loanses
	 */
	public static List<Loans> findBysurname(String surname) {
		return getPersistence().findBysurname(surname);
	}

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
	public static List<Loans> findBysurname(
		String surname, int start, int end) {

		return getPersistence().findBysurname(surname, start, end);
	}

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
	public static List<Loans> findBysurname(
		String surname, int start, int end,
		OrderByComparator<Loans> orderByComparator) {

		return getPersistence().findBysurname(
			surname, start, end, orderByComparator);
	}

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
	public static List<Loans> findBysurname(
		String surname, int start, int end,
		OrderByComparator<Loans> orderByComparator, boolean useFinderCache) {

		return getPersistence().findBysurname(
			surname, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first loans in the ordered set where surname = &#63;.
	 *
	 * @param surname the surname
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching loans
	 * @throws NoSuchLoansException if a matching loans could not be found
	 */
	public static Loans findBysurname_First(
			String surname, OrderByComparator<Loans> orderByComparator)
		throws com.liferay.training.people.exception.NoSuchLoansException {

		return getPersistence().findBysurname_First(surname, orderByComparator);
	}

	/**
	 * Returns the first loans in the ordered set where surname = &#63;.
	 *
	 * @param surname the surname
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching loans, or <code>null</code> if a matching loans could not be found
	 */
	public static Loans fetchBysurname_First(
		String surname, OrderByComparator<Loans> orderByComparator) {

		return getPersistence().fetchBysurname_First(
			surname, orderByComparator);
	}

	/**
	 * Returns the last loans in the ordered set where surname = &#63;.
	 *
	 * @param surname the surname
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching loans
	 * @throws NoSuchLoansException if a matching loans could not be found
	 */
	public static Loans findBysurname_Last(
			String surname, OrderByComparator<Loans> orderByComparator)
		throws com.liferay.training.people.exception.NoSuchLoansException {

		return getPersistence().findBysurname_Last(surname, orderByComparator);
	}

	/**
	 * Returns the last loans in the ordered set where surname = &#63;.
	 *
	 * @param surname the surname
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching loans, or <code>null</code> if a matching loans could not be found
	 */
	public static Loans fetchBysurname_Last(
		String surname, OrderByComparator<Loans> orderByComparator) {

		return getPersistence().fetchBysurname_Last(surname, orderByComparator);
	}

	/**
	 * Returns the loanses before and after the current loans in the ordered set where surname = &#63;.
	 *
	 * @param peopleId the primary key of the current loans
	 * @param surname the surname
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next loans
	 * @throws NoSuchLoansException if a loans with the primary key could not be found
	 */
	public static Loans[] findBysurname_PrevAndNext(
			long peopleId, String surname,
			OrderByComparator<Loans> orderByComparator)
		throws com.liferay.training.people.exception.NoSuchLoansException {

		return getPersistence().findBysurname_PrevAndNext(
			peopleId, surname, orderByComparator);
	}

	/**
	 * Removes all the loanses where surname = &#63; from the database.
	 *
	 * @param surname the surname
	 */
	public static void removeBysurname(String surname) {
		getPersistence().removeBysurname(surname);
	}

	/**
	 * Returns the number of loanses where surname = &#63;.
	 *
	 * @param surname the surname
	 * @return the number of matching loanses
	 */
	public static int countBysurname(String surname) {
		return getPersistence().countBysurname(surname);
	}

	/**
	 * Caches the loans in the entity cache if it is enabled.
	 *
	 * @param loans the loans
	 */
	public static void cacheResult(Loans loans) {
		getPersistence().cacheResult(loans);
	}

	/**
	 * Caches the loanses in the entity cache if it is enabled.
	 *
	 * @param loanses the loanses
	 */
	public static void cacheResult(List<Loans> loanses) {
		getPersistence().cacheResult(loanses);
	}

	/**
	 * Creates a new loans with the primary key. Does not add the loans to the database.
	 *
	 * @param peopleId the primary key for the new loans
	 * @return the new loans
	 */
	public static Loans create(long peopleId) {
		return getPersistence().create(peopleId);
	}

	/**
	 * Removes the loans with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param peopleId the primary key of the loans
	 * @return the loans that was removed
	 * @throws NoSuchLoansException if a loans with the primary key could not be found
	 */
	public static Loans remove(long peopleId)
		throws com.liferay.training.people.exception.NoSuchLoansException {

		return getPersistence().remove(peopleId);
	}

	public static Loans updateImpl(Loans loans) {
		return getPersistence().updateImpl(loans);
	}

	/**
	 * Returns the loans with the primary key or throws a <code>NoSuchLoansException</code> if it could not be found.
	 *
	 * @param peopleId the primary key of the loans
	 * @return the loans
	 * @throws NoSuchLoansException if a loans with the primary key could not be found
	 */
	public static Loans findByPrimaryKey(long peopleId)
		throws com.liferay.training.people.exception.NoSuchLoansException {

		return getPersistence().findByPrimaryKey(peopleId);
	}

	/**
	 * Returns the loans with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param peopleId the primary key of the loans
	 * @return the loans, or <code>null</code> if a loans with the primary key could not be found
	 */
	public static Loans fetchByPrimaryKey(long peopleId) {
		return getPersistence().fetchByPrimaryKey(peopleId);
	}

	/**
	 * Returns all the loanses.
	 *
	 * @return the loanses
	 */
	public static List<Loans> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<Loans> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<Loans> findAll(
		int start, int end, OrderByComparator<Loans> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<Loans> findAll(
		int start, int end, OrderByComparator<Loans> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the loanses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of loanses.
	 *
	 * @return the number of loanses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static LoansPersistence getPersistence() {
		return _persistence;
	}

	private static volatile LoansPersistence _persistence;

}
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

package com.liferay.training.people.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.training.people.model.Loans;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Loans. This utility wraps
 * <code>com.liferay.training.people.service.impl.LoansLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see LoansLocalService
 * @generated
 */
public class LoansLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.training.people.service.impl.LoansLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the loans to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LoansLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param loans the loans
	 * @return the loans that was added
	 */
	public static Loans addLoans(Loans loans) {
		return getService().addLoans(loans);
	}

	/**
	 * Creates a new loans with the primary key. Does not add the loans to the database.
	 *
	 * @param peopleId the primary key for the new loans
	 * @return the new loans
	 */
	public static Loans createLoans(long peopleId) {
		return getService().createLoans(peopleId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the loans from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LoansLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param loans the loans
	 * @return the loans that was removed
	 */
	public static Loans deleteLoans(Loans loans) {
		return getService().deleteLoans(loans);
	}

	/**
	 * Deletes the loans with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LoansLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param peopleId the primary key of the loans
	 * @return the loans that was removed
	 * @throws PortalException if a loans with the primary key could not be found
	 */
	public static Loans deleteLoans(long peopleId) throws PortalException {
		return getService().deleteLoans(peopleId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.people.model.impl.LoansModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.people.model.impl.LoansModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static Loans fetchLoans(long peopleId) {
		return getService().fetchLoans(peopleId);
	}

	/**
	 * Returns the loans matching the UUID and group.
	 *
	 * @param uuid the loans's UUID
	 * @param groupId the primary key of the group
	 * @return the matching loans, or <code>null</code> if a matching loans could not be found
	 */
	public static Loans fetchLoansByUuidAndGroupId(String uuid, long groupId) {
		return getService().fetchLoansByUuidAndGroupId(uuid, groupId);
	}

	public static List<Loans> findBySurname(String surname) {
		return getService().findBySurname(surname);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the loans with the primary key.
	 *
	 * @param peopleId the primary key of the loans
	 * @return the loans
	 * @throws PortalException if a loans with the primary key could not be found
	 */
	public static Loans getLoans(long peopleId) throws PortalException {
		return getService().getLoans(peopleId);
	}

	/**
	 * Returns the loans matching the UUID and group.
	 *
	 * @param uuid the loans's UUID
	 * @param groupId the primary key of the group
	 * @return the matching loans
	 * @throws PortalException if a matching loans could not be found
	 */
	public static Loans getLoansByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return getService().getLoansByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the loanses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.people.model.impl.LoansModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of loanses
	 * @param end the upper bound of the range of loanses (not inclusive)
	 * @return the range of loanses
	 */
	public static List<Loans> getLoanses(int start, int end) {
		return getService().getLoanses(start, end);
	}

	/**
	 * Returns all the loanses matching the UUID and company.
	 *
	 * @param uuid the UUID of the loanses
	 * @param companyId the primary key of the company
	 * @return the matching loanses, or an empty list if no matches were found
	 */
	public static List<Loans> getLoansesByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getLoansesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of loanses matching the UUID and company.
	 *
	 * @param uuid the UUID of the loanses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of loanses
	 * @param end the upper bound of the range of loanses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching loanses, or an empty list if no matches were found
	 */
	public static List<Loans> getLoansesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Loans> orderByComparator) {

		return getService().getLoansesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of loanses.
	 *
	 * @return the number of loanses
	 */
	public static int getLoansesCount() {
		return getService().getLoansesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	public static Loans insertLoan(
		String name, String surname, java.util.Date birth, float total_loan) {

		return getService().insertLoan(name, surname, birth, total_loan);
	}

	/**
	 * Updates the loans in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LoansLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param loans the loans
	 * @return the loans that was updated
	 */
	public static Loans updateLoans(Loans loans) {
		return getService().updateLoans(loans);
	}

	public static LoansLocalService getService() {
		return _service;
	}

	private static volatile LoansLocalService _service;

}
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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LoansLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see LoansLocalService
 * @generated
 */
public class LoansLocalServiceWrapper
	implements LoansLocalService, ServiceWrapper<LoansLocalService> {

	public LoansLocalServiceWrapper() {
		this(null);
	}

	public LoansLocalServiceWrapper(LoansLocalService loansLocalService) {
		_loansLocalService = loansLocalService;
	}

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
	@Override
	public com.liferay.training.people.model.Loans addLoans(
		com.liferay.training.people.model.Loans loans) {

		return _loansLocalService.addLoans(loans);
	}

	/**
	 * Creates a new loans with the primary key. Does not add the loans to the database.
	 *
	 * @param peopleId the primary key for the new loans
	 * @return the new loans
	 */
	@Override
	public com.liferay.training.people.model.Loans createLoans(long peopleId) {
		return _loansLocalService.createLoans(peopleId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _loansLocalService.createPersistedModel(primaryKeyObj);
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
	@Override
	public com.liferay.training.people.model.Loans deleteLoans(
		com.liferay.training.people.model.Loans loans) {

		return _loansLocalService.deleteLoans(loans);
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
	@Override
	public com.liferay.training.people.model.Loans deleteLoans(long peopleId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _loansLocalService.deleteLoans(peopleId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _loansLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _loansLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _loansLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _loansLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _loansLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _loansLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _loansLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _loansLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _loansLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.training.people.model.Loans fetchLoans(long peopleId) {
		return _loansLocalService.fetchLoans(peopleId);
	}

	/**
	 * Returns the loans matching the UUID and group.
	 *
	 * @param uuid the loans's UUID
	 * @param groupId the primary key of the group
	 * @return the matching loans, or <code>null</code> if a matching loans could not be found
	 */
	@Override
	public com.liferay.training.people.model.Loans fetchLoansByUuidAndGroupId(
		String uuid, long groupId) {

		return _loansLocalService.fetchLoansByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public java.util.List<com.liferay.training.people.model.Loans>
		findBySurname(String surname) {

		return _loansLocalService.findBySurname(surname);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _loansLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _loansLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _loansLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the loans with the primary key.
	 *
	 * @param peopleId the primary key of the loans
	 * @return the loans
	 * @throws PortalException if a loans with the primary key could not be found
	 */
	@Override
	public com.liferay.training.people.model.Loans getLoans(long peopleId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _loansLocalService.getLoans(peopleId);
	}

	/**
	 * Returns the loans matching the UUID and group.
	 *
	 * @param uuid the loans's UUID
	 * @param groupId the primary key of the group
	 * @return the matching loans
	 * @throws PortalException if a matching loans could not be found
	 */
	@Override
	public com.liferay.training.people.model.Loans getLoansByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _loansLocalService.getLoansByUuidAndGroupId(uuid, groupId);
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
	@Override
	public java.util.List<com.liferay.training.people.model.Loans> getLoanses(
		int start, int end) {

		return _loansLocalService.getLoanses(start, end);
	}

	/**
	 * Returns all the loanses matching the UUID and company.
	 *
	 * @param uuid the UUID of the loanses
	 * @param companyId the primary key of the company
	 * @return the matching loanses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.training.people.model.Loans>
		getLoansesByUuidAndCompanyId(String uuid, long companyId) {

		return _loansLocalService.getLoansesByUuidAndCompanyId(uuid, companyId);
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
	@Override
	public java.util.List<com.liferay.training.people.model.Loans>
		getLoansesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.training.people.model.Loans> orderByComparator) {

		return _loansLocalService.getLoansesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of loanses.
	 *
	 * @return the number of loanses
	 */
	@Override
	public int getLoansesCount() {
		return _loansLocalService.getLoansesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _loansLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _loansLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.liferay.training.people.model.Loans insertLoan(
		String name, String surname, java.util.Date birth, float total_loan) {

		return _loansLocalService.insertLoan(name, surname, birth, total_loan);
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
	@Override
	public com.liferay.training.people.model.Loans updateLoans(
		com.liferay.training.people.model.Loans loans) {

		return _loansLocalService.updateLoans(loans);
	}

	@Override
	public LoansLocalService getWrappedService() {
		return _loansLocalService;
	}

	@Override
	public void setWrappedService(LoansLocalService loansLocalService) {
		_loansLocalService = loansLocalService;
	}

	private LoansLocalService _loansLocalService;

}
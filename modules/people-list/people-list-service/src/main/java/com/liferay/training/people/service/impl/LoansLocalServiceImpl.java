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

package com.liferay.training.people.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.training.people.model.Loans;
import com.liferay.training.people.service.base.LoansLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.liferay.training.people.model.Loans",
	service = AopService.class
)
public class LoansLocalServiceImpl extends LoansLocalServiceBaseImpl {

	public Loans insertLoan(String name, String surname, Date birth, float total_loan) {
		long tableId = counterLocalService.increment(Loans.class.getName());

		Loans loan = loansPersistence.create(tableId);
		loan.setName(name);
		loan.setSurname(surname);
		loan.setBirth(birth);
		loan.setTotal_loan(total_loan);

		return loansPersistence.update(loan);

	}

	public List<Loans> findBySurname(String surname){
		return loansPersistence.findBysurname(surname);
	}

}
/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.liferay.sample.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.liferay.sample.model.InsultLog;
import com.liferay.sample.model.InsultLogModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the InsultLog service. Represents a row in the &quot;SAMPLE_InsultLog&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.sample.model.InsultLogModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link InsultLogImpl}.
 * </p>
 *
 * @author nickgaskill
 * @see InsultLogImpl
 * @see com.liferay.sample.model.InsultLog
 * @see com.liferay.sample.model.InsultLogModel
 * @generated
 */
public class InsultLogModelImpl extends BaseModelImpl<InsultLog>
	implements InsultLogModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a insult log model instance should use the {@link com.liferay.sample.model.InsultLog} interface instead.
	 */
	public static final String TABLE_NAME = "SAMPLE_InsultLog";
	public static final Object[][] TABLE_COLUMNS = {
			{ "insultLogId", Types.BIGINT },
			{ "insult", Types.VARCHAR },
			{ "rating", Types.VARCHAR },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table SAMPLE_InsultLog (insultLogId LONG not null primary key,insult VARCHAR(75) null,rating VARCHAR(75) null,groupId LONG,companyId LONG,userId LONG)";
	public static final String TABLE_SQL_DROP = "drop table SAMPLE_InsultLog";
	public static final String ORDER_BY_JPQL = " ORDER BY insultLog.insultLogId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY SAMPLE_InsultLog.insultLogId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.sample.model.InsultLog"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.sample.model.InsultLog"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.sample.model.InsultLog"));

	public InsultLogModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _insultLogId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setInsultLogId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _insultLogId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return InsultLog.class;
	}

	@Override
	public String getModelClassName() {
		return InsultLog.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("insultLogId", getInsultLogId());
		attributes.put("insult", getInsult());
		attributes.put("rating", getRating());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long insultLogId = (Long)attributes.get("insultLogId");

		if (insultLogId != null) {
			setInsultLogId(insultLogId);
		}

		String insult = (String)attributes.get("insult");

		if (insult != null) {
			setInsult(insult);
		}

		String rating = (String)attributes.get("rating");

		if (rating != null) {
			setRating(rating);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}
	}

	@Override
	public long getInsultLogId() {
		return _insultLogId;
	}

	@Override
	public void setInsultLogId(long insultLogId) {
		_insultLogId = insultLogId;
	}

	@Override
	public String getInsult() {
		if (_insult == null) {
			return StringPool.BLANK;
		}
		else {
			return _insult;
		}
	}

	@Override
	public void setInsult(String insult) {
		_insult = insult;
	}

	@Override
	public String getRating() {
		if (_rating == null) {
			return StringPool.BLANK;
		}
		else {
			return _rating;
		}
	}

	@Override
	public void setRating(String rating) {
		_rating = rating;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			InsultLog.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public InsultLog toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (InsultLog)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		InsultLogImpl insultLogImpl = new InsultLogImpl();

		insultLogImpl.setInsultLogId(getInsultLogId());
		insultLogImpl.setInsult(getInsult());
		insultLogImpl.setRating(getRating());
		insultLogImpl.setGroupId(getGroupId());
		insultLogImpl.setCompanyId(getCompanyId());
		insultLogImpl.setUserId(getUserId());

		insultLogImpl.resetOriginalValues();

		return insultLogImpl;
	}

	@Override
	public int compareTo(InsultLog insultLog) {
		long primaryKey = insultLog.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof InsultLog)) {
			return false;
		}

		InsultLog insultLog = (InsultLog)obj;

		long primaryKey = insultLog.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<InsultLog> toCacheModel() {
		InsultLogCacheModel insultLogCacheModel = new InsultLogCacheModel();

		insultLogCacheModel.insultLogId = getInsultLogId();

		insultLogCacheModel.insult = getInsult();

		String insult = insultLogCacheModel.insult;

		if ((insult != null) && (insult.length() == 0)) {
			insultLogCacheModel.insult = null;
		}

		insultLogCacheModel.rating = getRating();

		String rating = insultLogCacheModel.rating;

		if ((rating != null) && (rating.length() == 0)) {
			insultLogCacheModel.rating = null;
		}

		insultLogCacheModel.groupId = getGroupId();

		insultLogCacheModel.companyId = getCompanyId();

		insultLogCacheModel.userId = getUserId();

		return insultLogCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{insultLogId=");
		sb.append(getInsultLogId());
		sb.append(", insult=");
		sb.append(getInsult());
		sb.append(", rating=");
		sb.append(getRating());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.liferay.sample.model.InsultLog");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>insultLogId</column-name><column-value><![CDATA[");
		sb.append(getInsultLogId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>insult</column-name><column-value><![CDATA[");
		sb.append(getInsult());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rating</column-name><column-value><![CDATA[");
		sb.append(getRating());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = InsultLog.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			InsultLog.class
		};
	private long _insultLogId;
	private String _insult;
	private String _rating;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private InsultLog _escapedModel;
}
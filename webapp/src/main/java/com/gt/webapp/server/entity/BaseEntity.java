package com.gt.webapp.server.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@SuppressWarnings( "serial" )
@MappedSuperclass
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )
// @Data FIXME: Lombok @Data
public abstract class BaseEntity implements Cloneable, Serializable {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column( name = "id" )
	private Long	id				= 0l;

	@Temporal( TemporalType.TIMESTAMP )
	@Column( updatable = false )
	private Date	creationDate	= new Date( );
	@Column( updatable = false )
	private Long	createdByUserId;

	@Temporal( TemporalType.TIMESTAMP )
	private Date	updateDate		= new Date( );
	private Long	updateByUserId;

	private Boolean	enabled			= Boolean.TRUE;

	@Version
	private Long	version			= 0L;

	public Long getId( ) {
		return id;
	}

	public void setId( Long id ) {
		this.id = id;
	}

	public Date getCreationDate( ) {
		return creationDate;
	}

	public void setCreationDate( Date creationDate ) {
		this.creationDate = creationDate;
	}

	public Long getCreatedByUserId( ) {
		return createdByUserId;
	}

	public void setCreatedByUserId( Long createdByUserId ) {
		this.createdByUserId = createdByUserId;
	}

	public Date getUpdateDate( ) {
		return updateDate;
	}

	public void setUpdateDate( Date updateDate ) {
		this.updateDate = updateDate;
	}

	public Long getUpdateByUserId( ) {
		return updateByUserId;
	}

	public void setUpdateByUserId( Long updateByUserId ) {
		this.updateByUserId = updateByUserId;
	}

	public Boolean getEnabled( ) {
		return enabled;
	}

	public void setEnabled( Boolean enabled ) {
		this.enabled = enabled;
	}

	public Long getVersion( ) {
		return version;
	}

	public void setVersion( Long version ) {
		this.version = version;
	}

}
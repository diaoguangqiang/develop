#include "StdAfx.h"
#include "Utils.h"


CUtils::CUtils(void)
{
}


CUtils::~CUtils(void)
{
}

/*
*  @brief    : 
*  @inparam  : 
*  @outparam : 
*  @return 	 : 
*  @example  :
*  @date     : 6/29/2016  13:54
*/
string CUtils::getSysTime( )
{
	string str;

	char buf_time[64] = {0};

	time_t t = time(0);
	tm *pt;
	
	pt = localtime(&t);

	strftime(buf_time, sizeof(buf_time), "%Y-%m-%d_%H:%m:%S", pt);

	str = buf_time;

	return str;
}

int CUtils::delDir(char* _dir )
{
	if ( !_dir )
	{
		TRACE("[SRV] ERROR delDir() %s line[%d]", _dir, __LINE__);
		return 0;
	}

	char sPath[200] = {0};
	strcpy(sPath, _dir);

	CFileFind   ff;
	BOOL   bFound;
	char sTempFileFind[200] = {0};
	strcpy(sTempFileFind, sPath);
	strcat(sTempFileFind, "\\*.*");

	bFound   =   ff.FindFile(sTempFileFind);

	int index = 0;
	while( bFound )
	{
		index++;

		bFound   =   ff.FindNextFile();
		CString  sFilePath   =   ff.GetFilePath();

		if ( ff.IsDirectory() )
		{
			if ( !ff.IsDots() )
			{
				//TRACE("[SRV] INFO delDir() �ݹ� ��%s�� line[%d]", sFilePath, __LINE__);
				delDir( (LPSTR)(LPCTSTR)sFilePath );
			}
		} 
		else
		{
			 if ( ff.IsReadOnly() )
			 {
				  SetFileAttributes(sFilePath,   FILE_ATTRIBUTE_NORMAL);
			 }

			 //ɾ���ļ�
			 int ret = 1 /*DeleteFile( (LPSTR)(LPCTSTR)sFilePath )*/;
			 if ( 0 != ret  )
			 {
				 TRACE("[SRV] ERROR delDir() ɾ�� ��%s�� ʧ�� line[%d]", sFilePath, __LINE__);
			 }
			 else{
				 TRACE("[SRV] INFO delDir() ɾ�� ��%s�� �ɹ� line[%d]", sFilePath, __LINE__);
			 }
		}

		//TRACE("[SRV] INFO delDir() ѭ�� ��%d�� line[%d]", index, __LINE__);
	}

	ff.Close();
	SetFileAttributes(sPath,   FILE_ATTRIBUTE_NORMAL);
	
	//�����Ŀ¼���򷵻�
	int ret = 0;
	if (! (ret = strcmp(sPath,_dir)) )
	{
		//TRACE("[SRV] ERROR delDir() ret[%d] ��ɾ��Ŀ¼��%s�� line[%d]", ret, sPath, __LINE__);
		return 0;
	}

	if ( 0 == RemoveDirectory(sPath) )
	{
		TRACE("[SRV] ERROR delDir() ɾ�� ��%s�� ʧ�� line[%d]", sPath, __LINE__);
		return -1;
	}
	else
	{
		TRACE("[SRV] INFO delDir() ɾ�� ��%s�� �ɹ� line[%d]", sPath, __LINE__);
	}	

	return 0;
}

/*
*  @brief    : 
*  @inparam  : 
*  @outparam : 
*  @return 	 : 
*  @example  :
*  @date     : 6/29/2016  16:39
*/
bool CUtils::isIncludeName( char* _name )
{
	if ( !_name )	return false;
	
	const string str_all = "C:\\Windows\\SysWOW64\\msres\\LOG";

	string str = _name;

	string::size_type index = str_all.find( str );

	if ( index != string::npos )
	{
		TRACE("[SRV] INFO delDir() ��%s�� ���� ��%s�� line[%d]", str_all.c_str(), str.c_str(), __LINE__);
		return true;
	}
	else
	{
		TRACE("[SRV] INFO delDir() ��%s�� ������ ��%s�� line[%d]", str_all.c_str(),  str.c_str(),  __LINE__);
		return false;
	}

	return false;
}
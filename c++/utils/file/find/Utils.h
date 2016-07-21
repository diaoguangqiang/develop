#pragma once

#include <string>
using namespace std;


class CUtils
{
public:
	CUtils(void);
	~CUtils(void);

public:

	static string getSysTime( );

	static int delDir( char* _dir );

	static bool isIncludeName( char* _name );

private:

};


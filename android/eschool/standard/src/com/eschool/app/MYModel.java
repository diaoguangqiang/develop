package com.eschool.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.util.Log;

import com.app.eschool.db.ExamDao;
import com.app.eschool.db.ExamItemDao;
import com.app.eschool.db.RuleItemDao;
import com.eschool.app.domain.Exam;
import com.eschool.app.domain.ExamItem;
import com.eschool.app.domain.RuleItem;

/*
 * 所有DAO接口
 */
public class MYModel {
	
	public static final String TAG = "MYModel";
	
	protected Context context = null;
	
	public MYModel(Context text) {
		super();
		// TODO Auto-generated constructor stub
		context = text;
		
		//initRuleItem();
			
		initExam();
		
		//getList();
		
		initExamItem();
	}
	
	/*
	 * 
	 */
	private void initExamItem(){
		
		Log.d(TAG, "添加 " );
		
		List<ExamItem> list = new ArrayList<ExamItem>();
		
		
		for( int i = 0; i < 24; i++ ){
			ExamItem item = new ExamItem();
			item.setPid(""+i);
			item.setAnswer_a("");
			item.setAnswer_b("");
			item.setAnswer_c("");
			item.setAnswer_d("");
			item.setWhy("");
			
			switch(i){
				case 0:
					item.setProblem("关闭防火墙 ");
					item.setAnswer_a("service iptables stop");
					break;
				case 1:
					item.setProblem("禁止防火墙开机启动 ");
					item.setAnswer_a("chkconfig iptables --list" );
					break;
				case 2:
					item.setProblem("禁用Selinux机制命令" );
					item.setAnswer_a("vi /etc/sysconfig/selinux" );
					break;
				case 3:
					item.setProblem("linux 重启时钟服务命令 " );
					item.setAnswer_a("service ntpd restart" );
					break;
				case 4:
					item.setProblem("手动配置网卡1的IP " );
					item.setAnswer_a("vi /etc/sysconfig/network-scripts/ifcfg-eth0" );
					break;
				case 5:
					item.setProblem("重启网络服务命令 " );
					item.setAnswer_a("service network restart" );
					break;
				case 6:
					item.setProblem("给当前目录下的文件添加可执行权限 " );
					item.setAnswer_a("chmod -R a+x ./*" );
					break;
				case 7:
					item.setProblem("给目录添加用户属性 " );
					item.setAnswer_a("chown -R 用户名:用户组" );
					break;
				case 8:
					item.setProblem("检查进程是否存在 " );
					item.setAnswer_a("ps -ef | grep 进程名" );
					break;
				case 9:
					item.setProblem("修改主机名" );
					item.setAnswer_a("vi /etc/sysconfig/network" );
					break;
				case 10:
					item.setProblem("查找文件命令" );
					item.setAnswer_a("find ./* -name '文件名'" );
					break;
					
				case 11:
					item.setProblem("查看当前路径 " );
					item.setAnswer_a("pwd" );
					break;
				case 12:
					item.setProblem("后退上一级目录 " );
					item.setAnswer_a("cd .." );
					break;
				case 13:
					item.setProblem("删除文件命令 " );
					item.setAnswer_a("rm 文件" );
					break;
				case 14:
					item.setProblem("删除目录命令" );
					item.setAnswer_a("rm -rf 目录" );
					break;
				case 15:
					item.setProblem("压缩文件夹 " );
					item.setAnswer_a("tar -zcf 新名称.tar.gz  被压缩文件夹名称" );
					break;
				case 16:
					item.setProblem("修改机器时间为12点" );
					item.setAnswer_a("date -s 12:00:00" );
					break;
				case 17:
					item.setProblem("查找文件中内容" );
					item.setAnswer_a("find .// -name '*' -exec grep -n '内容' --color ./ {} \\;" );
					break;
				case 18:
					item.setProblem("Unix 重启时钟服务命令" );
					item.setAnswer_a("svcadm restart svc:/network/ntp:default" );
					break;
				case 19:
					item.setProblem("unix 手动配置网口1的IP" );
					item.setAnswer_a("ipadm create-addr -T static -a 静态IP//子网掩码数目 网卡名/acme" );
					item.setAnswer_b("例如：ipadm create-addr -T -a 192.168.2.173/21 net0/acme" );
					break;
				case 20:
					item.setProblem("unix 重启网络服务" );
					item.setAnswer_a("svcadm restart svc:/network/physical:default" );
					break;
				case 21:
					item.setProblem("unix 查询进程是否在运行命令" );
					item.setAnswer_a("ps auxww | grep 进程名" );
					break;
				case 22:
					item.setProblem("unix 修改主机名" );
					item.setAnswer_a("步骤1：svccfg -s system/identity:node setprop config/nodename = '主机名'" );
					item.setAnswer_b("步骤2：svcadm refresh svc:/system/identity:node;");
					item.setAnswer_c(" 步骤3：svcadm restart svc:/system/identity:node");
					item.setAnswer_d("步骤4：重启后即可");
					break;
				case 23:
					item.setProblem("创建链接文件，如 A->B " );
					item.setAnswer_a("ln -s B A" );				
					break;	
					
				default:
					item.setProblem("null " );
					item.setAnswer_a("null" );
					break;					
			}
						
			list.add(item);
		}
			
		saveExamItemList(list);
	}
	
	/*
	 * 初始化题库
	 */
	public void initExam(){
		List<Exam> list = new ArrayList<Exam>();
		
		for( int i = 1; i <= 1; i++ ){
					
			switch( i ){
				case 1:
				{					
					for( int j = 1; j <= 1; j++ )
					{
						Exam item = new Exam();	
						item.setHeader("专业");
						item.setName("计算机");
						item.setNum("10");
						item.setUnreadMsgCount(String.valueOf(j));
						list.add(item);
					}
					
				}
				break;
				
				case 2:
				{
					Exam item = new Exam();	
					item.setHeader("教育学");
					item.setName("英语 ");
					item.setNum("10");
					item.setUnreadMsgCount(String.valueOf(i));
					list.add(item);
				}
				break;
				
				case 3:
				{
					Exam item = new Exam();	
					item.setHeader("经济学");
					item.setName("专业名称 "+String.valueOf(i));
					item.setNum("10");
					item.setUnreadMsgCount(String.valueOf(i));
					list.add(item);
				}
					
					break;
				case 4:
				{
					Exam item = new Exam();	
					item.setHeader("管理学");
					item.setName("专业名称 "+String.valueOf(i));
					item.setNum("10");
					item.setUnreadMsgCount(String.valueOf(i));
					list.add(item);
				}
					
					break;
				case 5:
				{
					Exam item = new Exam();	
					item.setHeader("医学");
					item.setName("专业名称 "+String.valueOf(i));
					item.setNum("10");
					item.setUnreadMsgCount(String.valueOf(i));
					list.add(item);
				}
					break;
				case 6:
				{
					Exam item = new Exam();	
					item.setHeader("文学");
					item.setName("专业名称 "+String.valueOf(i));
					item.setNum("10");
					item.setUnreadMsgCount(String.valueOf(i));
					list.add(item);
				}
					
					break;
				case 7:
				{
					Exam item = new Exam();	
					item.setHeader("历史学");
					item.setName("专业名称 "+String.valueOf(i));
					item.setNum("10");
					item.setUnreadMsgCount(String.valueOf(i));
					list.add(item);
				}
					
					break;
				case 8:
				{
					Exam item = new Exam();	
					item.setHeader("法学");
					item.setName("专业名称 "+String.valueOf(i));
					item.setNum("10");
					item.setUnreadMsgCount(String.valueOf(i));
					list.add(item);
				}
					
					break;
				case 9:
				{
					Exam item = new Exam();	
					item.setHeader("哲学");
					item.setName("专业名称 "+String.valueOf(i));
					item.setNum("10");
					item.setUnreadMsgCount(String.valueOf(i));
					list.add(item);
				}
					break;
				case 10:
				{
					Exam item = new Exam();	
					item.setHeader("外语系");
					item.setName("日语 "+String.valueOf(i));
					item.setNum("10");
					item.setUnreadMsgCount(String.valueOf(i));
					list.add(item);
				}
					break;
				default:
				{
					Exam item = new Exam();	
					item.setHeader("其他");
					item.setName("专业名称 "+String.valueOf(i));
					item.setNum("10");
					item.setUnreadMsgCount(String.valueOf(i));
					list.add(item);
				}
					
					break;
			}
									
			
			
			//Log.d(TAG, "添加 " + item.getName() + " " + item.getHeader() );
		}
		
		saveExamList(list);
	}

	/*
	 * 初始化制度
	 */
	public void initRuleItem(){
		List<RuleItem> list = new ArrayList<RuleItem>();
		for(int i = 0; i <= 20; i++ ){
			RuleItem item = new RuleItem();
			item.setPid("1");
			item.setName("diao");
			list.add(item);
			//Log.d(TAG, "添加 " + item.getPid() + " " + item.getName() );
		}
		saveRuleItemList(list);
	}
	
	public boolean saveRuleItemList(List<RuleItem> list) {
        // TODO Auto-generated method stub
        RuleItemDao dao = new RuleItemDao(context);
        dao.saveList(list);
        return true;
    }
	
	public Map<String, RuleItem> getRuleItemList() {
        // TODO Auto-generated method stub
		RuleItemDao dao = new RuleItemDao(context);
        return dao.getList();
    }

	
	public boolean saveExamList(List<Exam> list) {
        // TODO Auto-generated method stub
        ExamDao dao = new ExamDao(context);
        dao.saveList(list);
        return true;
    }
	
	public Map<String, Exam> getExamMap() {
		// TODO Auto-generated method stub
		ExamDao dao = new ExamDao(context);
		//Log.d(TAG, "size: "+ String.valueOf(dao.getList().size()));
		return dao.getMap();
	}
	
	public boolean saveExamItemList(List<ExamItem> list) {
        // TODO Auto-generated method stub
        ExamItemDao dao = new ExamItemDao(context);
        dao.saveList(list);
        return true;
    }
	
	public Map<String, ExamItem> getExamItemMap() {
		// TODO Auto-generated method stub
		Log.d(TAG, "获取 " );
		ExamItemDao dao = new ExamItemDao(context);
		return dao.getMap();
	}
	
	
	
	
	
}

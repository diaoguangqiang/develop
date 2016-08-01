package com.eschool.app;

import android.graphics.Bitmap;


public class Constant {
	public static final String NEW_FRIENDS_USERNAME = "item_new_friends";
	public static final String GROUP_USERNAME = "item_groups";
 	public static final String ACCOUNT_REMOVED = "account_removed";	
	public static final String MESSAGE_ATTR_IS_VOICE_CALL = "is_voice_call";
    public static final String MESSAGE_ATTR_IS_VIDEO_CALL = "is_video_call";

    
    //服务器端
    public static final String URL_BASE = "http://127.0.0.1";
    public static final String URL_Login = URL_BASE + "/baifen/app.php";

    public static final String URL_Department_list = URL_BASE + "";
    
    
    public static final String URL_Register = "http://112.124.182.149/baifen/register.php";
    public static final String URL_Register_Tel = "http://112.124.182.149/baifen/register_tel.php";
    
  //  public static final String URL_Friends = "http://112.124.182.149/baifen/get_allfriends.php";
    public static final String URL_FriendList = "http://112.124.182.149/baifen/getMyFriends.php";
    public static final String URL_Avatar = "http://112.124.182.149/baifen/upload/";
    public static final String URL_UPDATE_Avatar = "http://112.124.182.149/baifen/update_avatar.php";
    public static final String URL_UPDATE_Nick = "http://112.124.182.149/baifen/update_nick.php";
    public static final String URL_UPDATE_Fxid= "http://112.124.182.149/baifen/update_fxid.php";
    public static final String URL_UPDATE_Region= "http://112.124.182.149/baifen/update_region.php";
    public static final String URL_UPDATE_Sign= "http://112.124.182.149/baifen/update_sign.php";
    public static final String URL_Search_User= "http://112.124.182.149/baifen/search_friends.php";
    public static final String URL_Get_UserInfo= "http://112.124.182.149/baifen/get_userinfo.php";
    public static final String URL_UPDATE_Sex = "http://112.124.182.149/baifen/update_sex.php";
    public static final String URL_UPDATE_Groupnanme ="http://112.124.182.149/baifen/update_groupname.php";
    public static final String URL_UPDATETIME ="http://112.124.182.149/baifen/update_time.php";
    public static final String URL_LASTERLOGIN="http://112.124.182.149/baifen/laster_login.php";
    public static final String URL_PAY="http://112.124.182.149/baifen/pay.php";
    public static final String URL_RECORDS="http://112.124.182.149/baifen/records.php";
    public static final String URL_CARDS="http://112.124.182.149/baifen/cardList.php";
    public static final String URL_ADD_CARD="http://112.124.182.149/baifen/addCard.php";
    public static final String URL_RECHARGE="http://112.124.182.149/baifen/recharge.php";
    public static final String URL_WIRHDROW="http://112.124.182.149/baifen/withdraw.php";
    
    //添加好友通知
    public static final String CMD_ADD_FRIEND="ADD_FRIEND";
    public static final String CMD_AGREE_FRIEND="AGREE_FRIEND";
    
    public static final String URL_ADD_FRIEND="http://112.124.182.149/baifen/accept_friend.php";
    //交易記錄
    public static final String C_RECORDS = "ja_records";
    public static final String CARDLIST = "ja_cardlist";
    
    //朋友圈接口
    // 服务器端
    public static final String URL_PUBLISH = "http://112.124.182.149/baifen/publish.php";
    public static final String URL_SOCIAL = "http://112.124.182.149/baifen/social.php";
    //public static final String URL_SOCIAL_PHOTO = "http://112.124.182.149/baifen/upload/";
    public static final String URL_SOCIAL_COMMENT = "http://112.124.182.149/baifen/comment.php";
    public static final String URL_SOCIAL_GOOD = "http://112.124.182.149/baifen/social_good.php";
    public static final String URL_SOCIAL_GOOD_CANCEL = "http://112.124.182.149/baifen/social_good_cancel.php";
    public static final String URL_SOCIAL_DELETE_COMMENT = "http://112.124.182.149/baifen/social_comment_delete.php";
    public static final String URL_SOCIAL_DELETE = "http://112.124.182.149/baifen/social_delete.php";
    public static final String URL_SOCIAL_FRIEND = "http://112.124.182.149/baifen/social_friend.php";

    /*
    public static ImageLoader imageLoader = ImageLoader.getInstance();
    public static DisplayImageOptions IM_IMAGE_OPTIONS = new DisplayImageOptions.Builder()
            .showImageOnLoading(R.drawable.ic_empty)
            .showImageForEmptyUri(R.drawable.ic_error)
            .showImageOnFail(R.drawable.ic_error)
            .bitmapConfig(Bitmap.Config.RGB_565)
            .imageScaleType(ImageScaleType.EXACTLY_STRETCHED)
            .displayer(new RoundedBitmapDisplayer(5)) // default //
                                                        // 可以设置动画，比如圆角或者渐
            .cacheInMemory(true).cacheOnDisc(false).build();
    */
    //打赏登记接口
    public static final String URL_ALIPAYME= "http://112.124.182.149/baifen/alipayme.php";
    public static final String URL_ALIPAYMELIST= "http://112.124.182.149/baifen/alipaymeList.php";
}

package com.drore.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
@Api(value = "测试swagger", description = "这是一个测试接口")
public class TestController {

	@RequestMapping(value = "/aa/{id}", method = RequestMethod.GET)
	@ApiOperation(value = "测试方法",notes = "访问接口")
	@ApiImplicitParam(name = "id", value = "用户ID", required = false, dataType = "String")
	public void test(@PathVariable String id){
		System.out.println("id==" + id );
	}


	@RequestMapping(value = "/bb", method = RequestMethod.POST)
	@ApiOperation(value = "获取数据",notes = "通过参数获取数据")
	@ApiImplicitParam(name = "object", value = "查询条件", required = true, dataType = "Object")
	public Object getData(@RequestBody Object object){
		return object;
	}
}

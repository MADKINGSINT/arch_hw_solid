# swagger_client.ScheduleApi

All URIs are relative to *https://localhost:9669*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_schedule**](ScheduleApi.md#add_schedule) | **POST** /Schedule | Добавить расписание
[**delete_schedule_by_id**](ScheduleApi.md#delete_schedule_by_id) | **DELETE** /Schedule/deleteById/{scheduleId} | Удалить расписание по ID
[**get_schedule_by_id**](ScheduleApi.md#get_schedule_by_id) | **GET** /Schedule/findById/{scheduleId} | Найти расписание по ID
[**update_schedule**](ScheduleApi.md#update_schedule) | **PUT** /Schedule | Обновить расписание

# **add_schedule**
> Schedule add_schedule(body)

Добавить расписание

Добавить расписание в базу

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ScheduleApi()
body = swagger_client.Schedule() # Schedule | Создать новое расписание в базе

try:
    # Добавить расписание
    api_response = api_instance.add_schedule(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ScheduleApi->add_schedule: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Schedule**](Schedule.md)| Создать новое расписание в базе | 

### Return type

[**Schedule**](Schedule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_schedule_by_id**
> Schedule delete_schedule_by_id(schedule_id, schedule_id=schedule_id)

Удалить расписание по ID

Удаляет расписание

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ScheduleApi()
schedule_id = 789 # int | 
schedule_id = 'schedule_id_example' # str | Идентификатор расписания (optional)

try:
    # Удалить расписание по ID
    api_response = api_instance.delete_schedule_by_id(schedule_id, schedule_id=schedule_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ScheduleApi->delete_schedule_by_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedule_id** | **int**|  | 
 **schedule_id** | **str**| Идентификатор расписания | [optional] 

### Return type

[**Schedule**](Schedule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_schedule_by_id**
> Schedule get_schedule_by_id(schedule_id)

Найти расписание по ID

вернуть одно расписание

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ScheduleApi()
schedule_id = 789 # int | Идентификатор расписания

try:
    # Найти расписание по ID
    api_response = api_instance.get_schedule_by_id(schedule_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ScheduleApi->get_schedule_by_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedule_id** | **int**| Идентификатор расписания | 

### Return type

[**Schedule**](Schedule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_schedule**
> Schedule update_schedule(body)

Обновить расписание

Обновить расписание

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ScheduleApi()
body = swagger_client.Schedule() # Schedule | Обновить существующее расписание в базе

try:
    # Обновить расписание
    api_response = api_instance.update_schedule(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ScheduleApi->update_schedule: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Schedule**](Schedule.md)| Обновить существующее расписание в базе | 

### Return type

[**Schedule**](Schedule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


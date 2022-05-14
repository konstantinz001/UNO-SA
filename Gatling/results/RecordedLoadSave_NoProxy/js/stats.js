var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "40064",
        "ok": "29759",
        "ko": "10305"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "1438"
    },
    "maxResponseTime": {
        "total": "12391",
        "ok": "12391",
        "ko": "9409"
    },
    "meanResponseTime": {
        "total": "1411",
        "ok": "588",
        "ko": "3788"
    },
    "standardDeviation": {
        "total": "1994",
        "ok": "1427",
        "ko": "1407"
    },
    "percentiles1": {
        "total": "11",
        "ok": "5",
        "ko": "3406"
    },
    "percentiles2": {
        "total": "2634",
        "ok": "221",
        "ko": "4643"
    },
    "percentiles3": {
        "total": "5577",
        "ok": "3506",
        "ko": "6397"
    },
    "percentiles4": {
        "total": "7617",
        "ok": "7109",
        "ko": "8510"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 24167,
    "percentage": 60
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 697,
    "percentage": 2
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 4895,
    "percentage": 12
},
    "group4": {
    "name": "failed",
    "count": 10305,
    "percentage": 26
},
    "meanNumberOfRequestsPerSecond": {
        "total": "101.944",
        "ok": "75.723",
        "ko": "26.221"
    }
},
contents: {
"req_load-ec4d1": {
        type: "REQUEST",
        name: "load",
path: "load",
pathFormatted: "req_load-ec4d1",
stats: {
    "name": "load",
    "numberOfRequests": {
        "total": "20032",
        "ok": "13417",
        "ko": "6615"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "1438"
    },
    "maxResponseTime": {
        "total": "10804",
        "ok": "10804",
        "ko": "9404"
    },
    "meanResponseTime": {
        "total": "1614",
        "ok": "626",
        "ko": "3617"
    },
    "standardDeviation": {
        "total": "2022",
        "ok": "1500",
        "ko": "1351"
    },
    "percentiles1": {
        "total": "255",
        "ok": "6",
        "ko": "3189"
    },
    "percentiles2": {
        "total": "2785",
        "ok": "314",
        "ko": "4450"
    },
    "percentiles3": {
        "total": "5646",
        "ok": "4266",
        "ko": "6163"
    },
    "percentiles4": {
        "total": "7584",
        "ok": "7531",
        "ko": "7644"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 10885,
    "percentage": 54
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 257,
    "percentage": 1
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 2275,
    "percentage": 11
},
    "group4": {
    "name": "failed",
    "count": 6615,
    "percentage": 33
},
    "meanNumberOfRequestsPerSecond": {
        "total": "50.972",
        "ok": "34.14",
        "ko": "16.832"
    }
}
    },"req_save-43781": {
        type: "REQUEST",
        name: "save",
path: "save",
pathFormatted: "req_save-43781",
stats: {
    "name": "save",
    "numberOfRequests": {
        "total": "20032",
        "ok": "16342",
        "ko": "3690"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "1465"
    },
    "maxResponseTime": {
        "total": "12391",
        "ok": "12391",
        "ko": "9409"
    },
    "meanResponseTime": {
        "total": "1209",
        "ok": "557",
        "ko": "4095"
    },
    "standardDeviation": {
        "total": "1945",
        "ok": "1362",
        "ko": "1453"
    },
    "percentiles1": {
        "total": "6",
        "ok": "3",
        "ko": "3673"
    },
    "percentiles2": {
        "total": "2199",
        "ok": "180",
        "ko": "4974"
    },
    "percentiles3": {
        "total": "5540",
        "ok": "3102",
        "ko": "7116"
    },
    "percentiles4": {
        "total": "7646",
        "ok": "6926",
        "ko": "8536"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 13282,
    "percentage": 66
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 440,
    "percentage": 2
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 2620,
    "percentage": 13
},
    "group4": {
    "name": "failed",
    "count": 3690,
    "percentage": 18
},
    "meanNumberOfRequestsPerSecond": {
        "total": "50.972",
        "ok": "41.583",
        "ko": "9.389"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
